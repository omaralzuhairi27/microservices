package at.nacs.cashier.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Ticket {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToMany(fetch = FetchType.EAGER)
  private List<Product> products = new ArrayList<>();
  
  private double totalPrise;
}
