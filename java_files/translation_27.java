import java.util.*;

public class Translation27 {
    public boolean equals(Object obj) {
    if ( !(obj instanceof FacetLabel) ) return false;
    final FacetLabel other = (FacetLabel) obj;
    if ( length != other.length() ) return false;
    for (int i=length-1;
    i>=0;
    i--) {
        if ( !components[i].equals(other.components[i]) ) return false;
    }
    return true;
}
Create a new class called "Person" with the following attributes: public String name;
public int age;
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
}