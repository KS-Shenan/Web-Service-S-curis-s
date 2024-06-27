package infres.ws.rest.repository;


import infres.ws.rest.model.ReservationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationRequest, Long> {
}
