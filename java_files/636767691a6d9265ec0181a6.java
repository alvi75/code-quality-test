import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    /**Split the given string toSplit at the first occurrence of the given delimiter,and return two substrings that don't include the delimiter.**/
public static String[] split(String toSplit,String delimiter){
        int pos = 0;
        List<String> result = new ArrayList<>();
        while (pos < toSplit.length()){
            if (toSplit.charAt(pos) == delimiter.charAt(0)){
                result.add(toSplit.substring(pos, pos + delimiter.length()));
                pos += delimiter.length();
            } else {
                pos++;
            }
        }
        return result.toArray(new String[result.size()]);
    }
}