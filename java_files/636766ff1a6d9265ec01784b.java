import java.util.*;

public class Generated_636766ff1a6d9265ec01784b {
    public static boolean isDigits(String str){
		char[] chars = str.toCharArray();
		for(char c : chars){
			if(!Character.isDigit(c)){
				return false;
			}
		}
		return true;
	}
}