import java.util.*;

public class Generated_636766f21a6d9265ec017677 {
    public static boolean isNotTrue(Boolean bool){
		if(bool == null || !bool.booleanValue()){
			return false;
		}
		else{
			throw new IllegalArgumentException("Parameter must be false");
		}
	}
}