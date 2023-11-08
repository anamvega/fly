package com.airplane.fly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Lines")
@Data
public class Lines {
  @Id
  private Long id;
  private Long idCityDeparture;
  private Long idCityArrival;
}
