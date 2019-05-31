package at.nacs.cashier.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
  @Id
  @GeneratedValue
  private Long id;
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Purchase> puchases = new ArrayList<>();
}
