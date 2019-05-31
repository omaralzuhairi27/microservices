package at.nacs.cashier.initialise;

import at.nacs.cashier.domain.model.Purchase;
import at.nacs.cashier.domain.repository.PurchaseRepository;
import lombok.Setter;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class PurchaseInitialise {
  @Setter
  List<Purchase> products;

  ApplicationRunner applicationRunner(PurchaseRepository purchaseRepository){
    return args -> {
      purchaseRepository.saveAll(products);
    };
  }
}
