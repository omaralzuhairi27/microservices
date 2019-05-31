package at.nacs.cashier.domain.repository;

import at.nacs.cashier.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
