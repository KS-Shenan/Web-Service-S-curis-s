package infres.ws.rest.controller;

import infres.ws.rest.model.Flight;
import infres.ws.rest.model.ReservationRequest;
import infres.ws.rest.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id) {
        Optional<Flight> flight = flightRepository.findById(id);
        if (flight.isPresent()) {
            return ResponseEntity.ok(flight.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/reserve")
    public ResponseEntity<Flight> reserveFlight(@RequestBody ReservationRequest reservationRequest) {
        // Vous pouvez adapter ce code pour gérer la réservation en fonction de vos besoins
        Flight flight = new Flight();
        flight.setFlightNumber(reservationRequest.getFirstName() + " " + reservationRequest.getLastName()); // Exemple
        flight.setPrice(100.0); // Exemple
        Flight savedFlight = flightRepository.save(flight);
        return ResponseEntity.ok(savedFlight);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlight(@PathVariable Long id) {
        if (flightRepository.existsById(id)) {
            flightRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
