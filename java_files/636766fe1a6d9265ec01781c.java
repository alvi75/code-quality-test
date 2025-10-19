import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch){
		if(ch>256) return null;
		try{
			return (Character)cache.get((byte)ch);
		}catch(Exception e){
			return null;
		}
	}
}