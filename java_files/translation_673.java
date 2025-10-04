import java.util.*;

public class Translation673 {
    public static int getEffectivePort(String scheme, int specifiedPort) {
    if (specifiedPort != -1) {
        return specifiedPort;
    }
    if (scheme == null) {
        return -1;
    }
    if (scheme.equalsIgnoreCase("http")) {
        return 80;
    }
    else if (scheme.equalsIgnoreCase("https")) {
        return 443;
    }
    else {
        return -1;
    }
}
Create a new class called "Person" with properties for name, age, and gender. assistant public Person(string name, int age, char gender){
    _name = name;
    _age = age;
    _gender = gender;
}
}