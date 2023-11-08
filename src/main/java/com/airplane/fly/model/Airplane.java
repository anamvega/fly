package com.airplane.fly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Airplane")
@Data
public class Airplane {

  @Id
  private Long id;
  private Long idTypePlane;
  private String status;
  private String specialLuggage;
}
