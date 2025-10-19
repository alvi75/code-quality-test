import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    /**Converts a name of the string type to a character array and converts the first letter to an uppercase letter.
@see #capitalize(char[])
@param name The name of the string type.
@return A new string with the first letter capitalized.
*/
public static String capitalize(String name){
char[] chars = name.toCharArray();
chars[0] = Character.toUpperCase(chars[0]);
return new String(chars);
}
}