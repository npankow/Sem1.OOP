package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        System.out.println("Болезнь:" + cat.getIllness());
//
//        System.out.println(cat.getNickName());

//        cat.setIllness(new Illness(null));

//        System.out.println("Болезнь:" + cat.getIllness());


//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickName());

//        cat.lifeCycle();
//
//        Animal catty = new Animal();
//        Dog goodBoy = new Dog();

//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();
//
//        List<Animal> animals = new ArrayList<Animal>();
//
//        animals.add(catty);
//        animals.add(goodBoy);
//        animals.add(cat);
        Bird voron = new Bird("Чирик", new Owner("Михаил"),
                LocalDate.of(2008, 1, 5), new Illness("не летает"));
        System.out.println(voron.getType());
        System.out.println("Класс животного: " + voron.getType() + ". " + "Имя животного: " + voron.getNickName());
        Bird.Action();
        Fish goldfish = new Fish("Золотая Рыбка", new Owner("Старик"),
                LocalDate.of(2000,10,10), new Illness("не исполняет желания"));
        System.out.println("Класс животного: " + goldfish.getType() + ". " + "Имя животного: " + goldfish.getNickName());
        Cat.fly();
        Cat.swim();
        Fish.fly();




//
//        int i = 0;
//        for (Animal animal : animals){
//            System.out.println(i + " "+ animal);
//            i++;
        }

    }
