import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
		if (getThrows() != null && !getThrows().isEmpty()){
			return true;
		}
		
		for (final JvmTypeReference exception : getExceptions()) {
			if (!exception.isExceptionType()) {
				return true;
			}
		}
		
		return false;
	}
}