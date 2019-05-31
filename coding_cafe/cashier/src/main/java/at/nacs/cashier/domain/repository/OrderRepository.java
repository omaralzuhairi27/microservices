package at.nacs.cashier.domain.repository;

import at.nacs.cashier.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Product,Long> {
  Product findByName(String name);

}
