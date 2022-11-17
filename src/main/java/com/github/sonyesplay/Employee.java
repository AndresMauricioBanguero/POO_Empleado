package com.github.sonyesplay;

public class Employee {
    private String name;
    private double salary;
    private int hours;

    //metodo para calcular el salario neto
    public double computeNetSalary() {
        double valueH = salary / 160;
        double netSalary = valueH * hours;
        return netSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
