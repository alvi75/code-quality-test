import java.util.*;

public class Translation567 {
    public static boolean isValidSchemeChar(int index, char c) {
    if ((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')) {
        return true;
    }
    if (index > 0 && ((c >= '0' && c <= '9')|| c == '+' || c == '-' || c == '.')) {
        return true;
    }
    return false;
}
Create a new class called "Person" with properties for name, age, and gender. assistant public Person(string name, int age, string gender){
    _name = name;
    _age = age;
    _gender = gender;
}
}