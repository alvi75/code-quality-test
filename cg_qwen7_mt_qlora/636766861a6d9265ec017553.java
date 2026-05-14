import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    /**Return true if the given name is a member variable of this template,otherwise return false.*/
public final boolean isTemplateVariablePresent(String name){
		if (name == null) {
			return false;
		}
		for (int i = 0; i < _variables.length; i++) {
			if (_variables[i].equals(name)) {
				return true;
			}
		}
		return false;
	}
}