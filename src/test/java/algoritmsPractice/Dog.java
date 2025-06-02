package algoritmsPractice;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }
    public void makeSound(){
        System.out.println(name+" Bark");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(3,"Buddy");
        Dog dog2 = new Dog(3,"Teddy");
        Dog dog3 = new Dog(3,"Teddy");
        System.out.println(Animal.count);
        dog1.makeSound();
        dog1.eat();





    }
}


