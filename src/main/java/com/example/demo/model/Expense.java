package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Уникальный Айди для БД

    private String title;
    private double amount;

    //Пустой конструктор нужен для Hibernate
    public Expense() {}
    public Expense (String title, double amount) {
        this.title = title;
        this.amount = amount;
    }

    //Геттеры и сеттеры
    public Long getId() {return id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}
}