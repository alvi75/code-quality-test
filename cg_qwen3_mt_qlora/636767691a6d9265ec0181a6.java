import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    /**Split the given string toSplit at the first occurrence of the given delimiter,and return two substrings that don't include the delimiter.*/
    public static String[] split(String toSplit,String delimiter){
        int index = toSplit.indexOf(delimiter);
        if(index == -1) return new String[]{toSplit};
        else return new String[]{toSplit.substring(0,index),toSplit.substring(index+delimiter.length())};
    }
}