package at.nacs.cashier.domain.repository;

import at.nacs.cashier.domain.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
