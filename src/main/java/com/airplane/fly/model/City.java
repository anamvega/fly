package com.airplane.fly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="City")
@Data
public class City {

  @Id
  private Long id;
  private String country;
  private String latitude;
  private String longitude;
}
