package com.apirest.problema8;

import java.util.UUID;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Funcionario {

    private UUID id; //gera id automático
    private String name;
    private int age;
    private Double salary;

    public Funcionario(){}

    public Funcionario(String nome, int age, Double salary){
        this.nome = nome;
        this.age = age;
        this.salary = salary;
    }
} 