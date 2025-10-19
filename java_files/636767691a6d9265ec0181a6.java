import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    /**Split the given string toSplit at the first occurrence of the given delimiter,and return two substrings that don't include the delimiter.
@param toSplit The string to be split.
@param delimiter The delimiter used to split the string.
@return A 2-element array containing the two substrings, or null if there is no delimiter in the string.
@see #split(String, char)
@since 1.0
*/
public static String[] split(String toSplit,String delimiter){
        int index = indexOf(toSplit,delimiter);
        if(index == -1) {
            return null;
        }
        else{
            return new String[]{toSplit.substring(0,index),toSplit.substring(index+delimiter.length())};
        }
    }
}