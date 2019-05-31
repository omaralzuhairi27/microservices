package at.nacs.cashier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class CashierApplication {

  public static void main(String[] args) {
    SpringApplication.run(CashierApplication.class, args);
  }

}
