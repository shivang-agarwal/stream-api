package com.zenon.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    Integer id;
    String name;
    BigDecimal salary;
    LocalDate dateOfJoing;

    public Employee() {}

    public Employee(Integer id, String name, BigDecimal salary, LocalDate dateOfJoing) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJoing = dateOfJoing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfJoing() {
        return dateOfJoing;
    }

    public void setDateOfJoing(LocalDate dateOfJoing) {
        this.dateOfJoing = dateOfJoing;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJoing=" + dateOfJoing +
                '}';
    }
}
