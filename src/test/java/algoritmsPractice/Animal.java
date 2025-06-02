package algoritmsPractice;

public class Animal {
  int age;
  String name;
  static int count;

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getName() {return name;}
    public void setName(String name) { this.name = name;}

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        count++;
    }

    public void makeSound(){

    }
    public void eat(){
        System.out.println( name+" eats");
    }
}
