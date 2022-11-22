package com.github.sonyesplay;

import java.util.Objects;

public class Employee {
    public static int NUMBER_EMPLOYEE = 0;

    public int getNumber() {
        return number;
    }

    private final int number;
    private final String name;
    private final double salary;
    private final int hours;
    private static final int HOURS_OF_MONTH = 160;
    private static final double RETENTION_OF_EMPLOYEE = 0.5;
    private static final double SALARY_TOP = 7_000_000;
    private static final double SALARY_BOT = 1_000_000;
    private static final double AUX_TRANSPORT = 65_000;
   /* private
    public
    protected
    default*/

    public Employee(String name, double salary, int hours) {
        valitation(name, salary, hours);
        NUMBER_EMPLOYEE++;//esto es para contar los empleados se incia en cero y ba agragando 1 + 1
        this.number = NUMBER_EMPLOYEE;
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
        return salary / HOURS_OF_MONTH;
    }

    public double computeNetSalary() {
        return valueHour() * hours;
    }

    //metodo para verificar si debe tener auxilio de transporte
    public boolean auxTransport() {
        return salary <= SALARY_BOT;
    }

    //metodo para verificar si debe tener a retencion en la fuente
    public boolean rentention() {
        return salary > SALARY_TOP;
    }

    //metodo para validar cual es el salario total
    public double salaryTotal() {
        double salaryT;
        if (auxTransport()) {
            salaryT = computeNetSalary() + AUX_TRANSPORT;
        } else if (rentention()) {
            salaryT = computeNetSalary() - (salary * RETENTION_OF_EMPLOYEE);
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
        builder.append("Este trabajador es el numero: ").append(number).append("\n");
        builder.append("Nombre: ").append(name).append("\n");
        builder.append("Salario: ").append(salary).append("\n");
        builder.append("Horas trabajadas: ").append(hours).append("\n");
        builder.append("Valor hora: ").append(valueHour()).append("\n");
        if (auxTransport()) {
            builder.append("Auxilio de transporte: ").append(AUX_TRANSPORT).append("\n");
        } else builder.append("Auxilio de transporte: ").append("no tiene auxilio").append("\n");
        if (rentention()) {
            builder.append("Retención: ").append((salary * RETENTION_OF_EMPLOYEE)).append("\n");
        } else builder.append("Auxilio de transporte: ").append("no tiene retencion").append("\n");
        builder.append("Total a pagar: ").append(salaryTotal()).append("\n");
        builder.append("_________________________________________________\n");

        return builder.toString();
    }
}