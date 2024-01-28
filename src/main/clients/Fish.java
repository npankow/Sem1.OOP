package main.clients;

import java.time.LocalDate;

public class Fish extends Animal {

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
    }

    //Исключения:
    public static void fly() {
        System.out.println("Рыбы летать не могут");
    }

    public static void toGo() {
        System.out.println("Рыбы ходить не могут");
    }
}
