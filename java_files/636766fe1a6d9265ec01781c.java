import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch){
		if(ch == 0)
			return null;
		else if(ch < 32 || ch > 126)
			throw new IllegalArgumentException("Illegal character: "+ch);
		return new Character(ch);
	}
}