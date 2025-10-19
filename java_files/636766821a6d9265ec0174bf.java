import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name){
		if(name==null || name.length()==0) return "";
		char[] letras = name.toCharArray();
		return new String(ArrayUtils.addAll(letras, Character.toUpperCase(letras[0])));
	}
}