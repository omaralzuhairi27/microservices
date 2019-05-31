package at.nacs.cashier.domain.repository;

import at.nacs.cashier.domain.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
}
