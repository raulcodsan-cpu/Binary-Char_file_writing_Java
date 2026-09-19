// Starter code for Person class
public class Person {
    // TODO 1: Add instance variables: name (String), age (int), weight (double)
    String name;
    int age;
    double weight;
    // TODO 2: Create constructor with 3 parameters
    public Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    // TODO 3: Implement toString() method
    public String toString(){
        return String.format("Name: %s, Age: %d, Weight: %.2f%n",name,age,weight);
    }
}
