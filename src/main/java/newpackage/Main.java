package newpackage;

import java.util.Scanner;

class Animal {

    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    void getName() {
        System.out.println("name :" + name);
    }

    void setName() {
        System.out.println("name :" + name);
    }

    void getAge() {
        System.out.println(" age:" + age);
    }

    void setAge() {
        System.out.println("age :" + age);
    }

    void makeSound() {
        System.out.println("sound");
    }

}

public class Main {

    public static void main(String[] args) {
     Animal a1= new Animal ();
     a1.getName();
    }

}
