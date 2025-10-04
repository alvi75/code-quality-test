import java.util.*;

public class Translation131 {
    public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) {
    return DVConstraint.createTimeConstraint(operatorType, formula1, formula2);
}
Create a new class called `CustomProperty` with the following properties: - `name` (String) - `value` (Object) Implement a constructor that initializes these properties. Also, override the `equals()` method to compare two `CustomProperty` objects based on their name and value.
}