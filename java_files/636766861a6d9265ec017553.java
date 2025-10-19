import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name){
		if (name==null)return false;
		for (int i=0;i<templateVariables.size();i++){
			if (((TemplateVariable)templateVariables.get(i)).getName().equals(name))return true;
		}
		return false;
	}
}