package Pet;
public class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setName("Stardenburdenhardenbart");
        cat.setWeight(4.4);
        System.out.println("My cat");
        System.out.println(cat.getName());;
        System.out.println(cat.getWeight());;
        cat.eat();
        cat.soundCat();
        System.out.println("--------------------");
        System.out.println("My dog");
        dog.setName("Chikago");
        dog.setWeight(8.0);
        System.out.println(dog.getName());;
        System.out.println(dog.getWeight());
        dog.eat();
        dog.soundDog();
    }
}
