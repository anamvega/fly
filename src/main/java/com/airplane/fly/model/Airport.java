package com.airplane.fly.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Airport")
@Data
public class Airport {

  @Id
  private Long id;
  private String nameAirport;
  private Long idCity;
}
