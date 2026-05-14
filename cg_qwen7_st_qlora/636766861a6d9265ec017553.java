import java.util.*;

public class Generated_636766861a6d9265ec017553 {
    public final boolean isTemplateVariablePresent(String name){
		if (name == null || name.isEmpty()) {
			return false;
		}
		
		for (int i = 0; i < m_templateVariables.size(); ++i) {
			String varName = m_templateVariables.get(i);
			
			if(varName.equals(name)){
				return true;
			}
		}
		
		return false;
	}
}