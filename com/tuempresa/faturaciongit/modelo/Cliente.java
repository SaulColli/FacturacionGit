package com.tuempresa.faturaciongit.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@View(name="Simple", members="numero, nombre")
@Entity @Getter @Setter
public class Cliente {
@Id
@Column(length=6)
int numero;

@Required
@Column(length=50)
String nombre;

  @Embedded @NoFrame
  Direccion direccion;
}
