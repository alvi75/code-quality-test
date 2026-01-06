import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    public static String[] split(String toSplit,String delimiter){
        int index = toSplit.indexOf(delimiter);
        if(index == -1) return new String[]{toSplit};
        else return new String[]{toSplit.substring(0,index),toSplit.substring(index+delimiter.length())};
    }
}