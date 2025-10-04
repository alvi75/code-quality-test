import java.util.*;

public class Translation574 {
    public static boolean[] copyOf(boolean[] original, int newLength) {
    if (newLength < 0) {
        throw new NegativeArraySizeException();
    }
    return copyOfRange(original, 0, newLength);
}
Create a class called Person with properties for name, age, and gender. Implement a method to get the person's name. assistant public class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}