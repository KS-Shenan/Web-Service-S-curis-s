package infres.ws.rest.dao;

import infres.ws.rest.model.Flight;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FlightDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public void save(Flight flight) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(flight);
        em.getTransaction().commit();
        em.close();
    }

    public Flight findById(Long id) {
        EntityManager em = emf.createEntityManager();
        Flight flight = em.find(Flight.class, id);
        em.close();
        return flight;
    }

    public List<Flight> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Flight> flights = em.createQuery("FROM Flight", Flight.class).getResultList();
        em.close();
        return flights;
    }

    public void deleteById(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Flight flight = em.find(Flight.class, id);
        if (flight != null) {
            em.remove(flight);
        }
        em.getTransaction().commit();
        em.close();
    }
}
