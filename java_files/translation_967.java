import java.util.*;

public class Translation967 {
    public static double max(double[] values) {
    double max = Double.MIN_VALUE;
    for (double value : values) {
        max = Math.max(max, value);
    }
    return max;
}
Create a new class called "Person" with the following attributes: - name (String) - age (int) - address (String) - phone (String) - email (String) public Person(String name, int age, String address, String phone, String email) {
    setName(name);
    setAge(age);
    setAddress(address);
    setPhone(phone);
    setEmail(email);
}
}