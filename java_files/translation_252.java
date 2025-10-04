import java.util.*;

public class Translation252 {
    public E pollLast() {
    Map.Entry<E, Object> entry = backingMap.pollLastEntry();
    return (entry == null) ? null : entry.getKey();
}
Create a new class called "Person" with attributes for first name, last name, and age. Implement a constructor that initializes these attributes, and also provide getter methods to retrieve the values of these attributes.
}