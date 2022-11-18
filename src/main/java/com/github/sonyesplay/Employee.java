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
//metodo para verificar si debe tener auxilio de transporte
    public boolean auxTransport() {
        boolean aux;
        if (salary <= 1_000_000) {
            aux = true;
        } else {
            aux = false;
        }

        return aux;
    }
//metodo para verificar si debe tener a retencion en la fuente
    public boolean rentention() {
        boolean aux;
        if (salary > 7_000_000) {
            aux = true;
        } else {
            aux = false;
        }

        return aux;
    }
//metodo para validar cual es el salario total
    public double salaryTotal() {
        double salaryT;
        if (auxTransport() == true) {
            salaryT = computeNetSalary() + 65000;
        } else if (rentention() == true) {
            salaryT = computeNetSalary() - (salary * 0.05);
        } else {
            salaryT = computeNetSalary();
        }
        return salaryT;
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
