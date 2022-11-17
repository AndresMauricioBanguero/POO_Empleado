package com.github.sonyesplay;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("andres");
        employee.setSalary(1_000_000);
        employee.setHours(160);

        double netSalary =employee.computeNetSalary();
        System.out.println(netSalary);
    }
}