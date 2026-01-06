import java.util.*;

public class Generated_6367670a1a6d9265ec0179e7 {
    /**
 * Check whether the specified converter exists in converters. If yes, converter is returned. If no, null is returned.
 **/
public Converter lookup(final Class<?> clazz){
		for(Converter c : converters){
			if(c.getSupportedType().equals(clazz)){
				return c;
			}
		}
		return null;
	}
}