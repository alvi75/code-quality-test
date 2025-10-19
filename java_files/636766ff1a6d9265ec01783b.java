import java.util.*;

public class Generated_636766ff1a6d9265ec01783b {
    /**Get a substring from the specified String avoiding exceptions.
@throws IllegalArgumentException if the string is null or empty, or if the start index is negative,
or if the end index is less than the start index, or if either index exceeds the length of the string.
@return The substring, or null if the string was null or empty.
*/
public static String sub(String str,int start,int end){
if(str==null || str.length()==0) return null;
if(start<0) throw new IllegalArgumentException("start < 0");
if(end<0) throw new IllegalArgumentException("end < 0");
if(start>str.length()) throw new IllegalArgumentException("start > str.length()");
if(end>str.length()) throw new IllegalArgumentException("end > str.length()");

return str.substring(start,end);
}
}