import java.util.*;

public class Translation978 {
    public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) {
    if (numPayloadsSeen == 0) {
        return currentPayloadScore;
    }
    else {
        return Math.min(currentPayloadScore, currentScore);
    }
}
Create a new class called "Person" with properties for "firstName", "lastName", and "age". Implement a constructor that initializes these properties, and also provide getter methods to retrieve the values of these properties. assistant public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}
}