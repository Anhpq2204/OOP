package Bai5;

public class TestAnimal {
    public static void main(String[] args) {
//        //using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigdog1 = new BigDog();
        bigdog1.greeting();
//        //using polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal animal4=new Animal();
//        //downcast
        Dog dog2=(Dog) animal2;
        BigDog bigdog2=(BigDog) animal3;
        Dog dog3=(Dog) animal3;
       // Cat cat2=(Cat) animal2;
        dog3.greeting(dog2);
//        dog3.greeting(dog2);
//       dog2.greeting(bigdog2);
//        bigdog2.greeting(dog2);
//        bigdog2.greeting(bigdog1);
       dog3.greeting(bigdog2);
    }
}
