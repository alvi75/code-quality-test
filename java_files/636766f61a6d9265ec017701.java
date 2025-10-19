import java.util.*;

public class Generated_636766f61a6d9265ec017701 {
    public static int lastIndexOf(String str,String searchStr){
        if(str==null || searchStr==null) return INDEXNOTFOUND;
        int len1 = searchStr.length();
        int len2 = str.length();
        if(len2<len1) return INDEXNOTFOUND;
        
        //if the first char of searchStr is not equal to str's first char, it will always be found.
        if(searchStr.charAt(0)!=str.charAt(0)) {
            for(int i=len2-1;i>=0;--i) {
                if(str.charAt(i)==searchStr.charAt(0)) return i;
            }
        }
        
        //if the first char of searchStr is the same as str's first char, but different with the rest of str,
        //we need to check whether the whole str equals with searchStr.
        else if(searchStr.charAt(0)==str.charAt(0)) {
            for(int i=len2-1;i>=0;--i) {
                if(str.charAt(i)!=searchStr.charAt(i)) return INDEXNOTFOUND;
            }
        }
        
        //if the first char of searchStr is the same as str's first char, and all chars except the first one 
        //of str and searchStr are the same, we can use binary search to find out the position of the searchStr.
        else {
            int start = 0;
            int end = len2-1;
            while(start<end) {
                int mid = (start+end)/2;
                String tmp = str.substring(start, mid+1);
                if(tmp.equals(searchStr)) return mid;
                else if(tmp.compareToIgnoreCase(searchStr)>=0) start = mid+1;
                else end = mid;
            }
        }
        
        return INDEXNOTFOUND;
    }
}