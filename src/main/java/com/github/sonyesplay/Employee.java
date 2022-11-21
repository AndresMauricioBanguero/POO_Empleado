package com.github.sonyesplay;

import java.util.Objects;

public class Employee {
    private final String name;
    private final double salary;

    private final int hours;

    public Employee(String name, double salary, int hours) {
        valitation(name, salary, hours);
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }

    //metodo para validar la entrada de los datos
    private void valitation(String name, double salary, double hours) {
        Objects.requireNonNull(name, "El nombre no puede ser nulo");
        if (salary <= 0) {
            throw new IllegalStateException("El salario debe ser mayor a cero");
        }
        if (hours <= 0) {
            throw new IllegalStateException("Las horas trabajadas deben ser mayor a cero");
        }
    }

    //metodo para calcular el salario neto
    public double valueHour() {
        return salary / 160;
    }

    public double computeNetSalary() {
        double netSalary;
        netSalary = valueHour() * hours;
        return netSalary;
    }

    //metodo para verificar si debe tener auxilio de transporte
    public boolean auxTransport() {
        boolean aux;
        aux = salary <= 1_000_000;

        return aux;
    }

    //metodo para verificar si debe tener a retencion en la fuente
    public boolean rentention() {
        boolean aux;
        aux = salary > 7_000_000;

        return aux;
    }

    //metodo para validar cual es el salario total
    public double salaryTotal() {
        double salaryT;
        if (auxTransport()) {
            salaryT = computeNetSalary() + 65000;
        } else if (rentention()) {
            salaryT = computeNetSalary() - (salary * 0.05);
        } else {
            salaryT = computeNetSalary();
        }
        return salaryT;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("DESPRENDIBLE DE PAGO\n");
        builder.append("_________________________________________________\n");
        builder.append("Nombre: ").append(name).append("\n");
        builder.append("Salario: ").append(salary).append("\n");
        builder.append("Horas trabajadas: ").append(hours).append("\n");
        builder.append("Valor hora: ").append(valueHour()).append("\n");
        if (auxTransport()) {
            builder.append("Auxilio de transporte: ").append(65000).append("\n");
        } else builder.append("Auxilio de transporte: ").append("no tiene auxilio").append("\n");
        if (rentention()) {
            builder.append("Retención: ").append((salary * 0.05)).append("\n");
        } else builder.append("Auxilio de transporte: ").append("no tiene retencion").append("\n");
        builder.append("Total a pagar: ").append(salaryTotal()).append("\n");
        builder.append("_________________________________________________\n");

        return builder.toString();
    }
}