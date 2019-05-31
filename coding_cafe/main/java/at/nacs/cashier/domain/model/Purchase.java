package at.nacs.cashier.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Purchase {

  @GeneratedValue
  @Id
  private Long id;
  @Column(unique = true)
  private String name;
  private Double prise;
}
