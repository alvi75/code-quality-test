import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    /**Return true if the given name is a member variable of this template,otherwise return false.**/
    public final boolean isTemplateVariablePresent(String name) {
        for (int i = 0; i < variables.size(); i++) {
            if (variables.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}