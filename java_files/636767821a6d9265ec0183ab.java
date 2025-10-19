import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
		if (thrownExceptions == null){
			return false;
		}
		
		for (int i=0; i<thrownExceptions.length; i++){
			if (thrownExceptions[i] != null){
				return true;
			}
		}
		
		return false;
	}
}