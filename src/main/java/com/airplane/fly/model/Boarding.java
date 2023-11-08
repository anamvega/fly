package com.airplane.fly.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Boarding")
@Data
public class Boarding {

  @Id
  private Long id;
  private Long idAirport;
  private String boardingGate;
}
