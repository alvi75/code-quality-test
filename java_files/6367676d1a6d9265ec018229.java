import java.util.*;

public class Generated_6367676d1a6d9265ec018229 {
    /**Trim each element in the given string array and return the resulting array.
@since 1.0
@param array The array to be trimmed.
@return A new array with all elements trimmed.
*/
public static String[] trimArrayElements(String[] array){
String[] result = new String[array.length];
for(int i=0;i<array.length;++i)
result[i] = trim(array[i]);
return result;
}
}