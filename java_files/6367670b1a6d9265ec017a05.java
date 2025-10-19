import java.util.*;

public class Generated_6367670b1a6d9265ec017a05 {
    public static String toString(final char ch){
		if(ch>0x7F || ch<0x20) return new String(new char[]{ch});
		return new String(new char[]{ch}).intern();
	}
}