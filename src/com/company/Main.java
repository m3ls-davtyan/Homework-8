package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.print("\n");
        System.out.println("EX 1");
        System.out.print("\n");

        Person person = new Person();
        person.setFirstName("Mels_davtyan");
        person.setLastName("melsDavtyan");
        person.setSex("male");
        person.setAge(18);
        person.setPassportId("AN008506");
        person.writeAll();

        System.out.print("\n");
        System.out.println("EX 2");
        System.out.print("\n");

        Store store = new Store();
        store.setPhoneNumber("98538163");
        store.setName("Prototype console");
        store.setCountOfProduct(11);
        store.setCountOfWorkers(35);
        store.buy1Product();
        store.writeAll();

        System.out.print("\n");
        System.out.println("EX 3");
        System.out.print("\n");

        Square square = new Square();
        Circle circle = new Circle();

        square.setA(2);
        circle.setR(1);

        circle.setPerimeter();
        circle.setArea();
        square.setPerimeter();
        square.setArea();


        System.out.println("Circle area is " + circle.getArea());
        System.out.println("Circle Perimeter is " + circle.getPerimeter());
        System.out.println("\n");
        System.out.println("Square area is " + square.getArea());
        System.out.println("Square Perimeter is " + square.getPerimeter());
    }
}
