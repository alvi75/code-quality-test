import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name){
        for (int i = 0; i < getTemplateVariables().size(); i++) {
            TemplateVariable tv = getTemplateVariables().get(i);
            if (tv.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}