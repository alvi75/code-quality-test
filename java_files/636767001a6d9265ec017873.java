import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
		if(str==null || str.length()==0) return "";
		char[] chrs = str.toCharArray();
		int left=0,right=str.length()-1;
		while(left<right){
			char temp=chrs[left];
			chrs[left++]=chrs[right];
			chrs[right--]=temp;
		}
		return new String(chrs);
	}
}