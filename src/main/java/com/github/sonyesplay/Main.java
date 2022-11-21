package com.github.sonyesplay;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("andres banguero", 1_000_000, 160);
        Employee employee1 = new Employee("cristo bbb", 8_000_000, 160);
        Employee employee2 = new Employee("pedro zambrano", 1_500_000, 160);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}