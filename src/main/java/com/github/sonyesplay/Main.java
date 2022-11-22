package com.github.sonyesplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("A continuacion ingrese el nombre");
            String name = sc.next();
            System.out.println("A continuacion ingrese el salario");
            double salary = sc.nextDouble();
            System.out.println("A continuacion ingrese el horas laboradas");
            int hours = sc.nextInt();
            Employee employee = new Employee(name, salary, hours);
            System.out.println(employee);
            System.out.println("si desea averiguar el salario de otro trabajador Presionar 1 de lo contrario presione cualquier letra");
            int valitate = sc.nextInt();
            if (valitate == 1) {
            } else {
                x = false;
                System.out.println("se cerro el program");
            }



        }
    }
}