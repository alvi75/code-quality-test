import java.util.*;

public class Translation245 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (obj == null)return false;
    if (getClass() != obj.getClass())return false;
    Toffs other = (Toffs) obj;
    if (startOffset != other.startOffset)return false;
    if (endOffset != other.endOffset)return false;
    return true;
}
Create a new class called "Person" with the following attributes: - name (String) - age (int) - address (String) - phone (String) - email (String) public Person(String name, int age, String address, String phone, String email) {
    setName(name);
    setAge(age);
    setAddress(address);
    setPhone(phone);
    setEmail(email);
}
}