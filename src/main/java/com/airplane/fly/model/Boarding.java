package com.airplane.fly.model;


import lombok.Data;

@Data
public class Boarding {
  private Long id;
  private Long idAirport;
  private String boardingGate;
}
