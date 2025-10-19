import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name){
		if(name==null || name.length()==0)
			return false;
		for(TemplateParameter param:this.getParameters())
			if(param.getName().equals(name))
				return true;
		return false;
	}
}