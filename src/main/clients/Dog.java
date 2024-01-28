package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }
        //Исключения:
        public static void fly(){
            System.out.println("Собаки летать не могут");
        }
    }
