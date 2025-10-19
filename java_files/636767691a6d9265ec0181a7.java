import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    /**Trim all the characters which are equal to the given character and appear at the beginning of the given string,and return the trimmed string.
@since 1.0
@param str The string to be trimmed.
@param leadingCharacter The character to be trimmed.
@return The trimmed string.
@see #trimTrailingCharacter(String, char)
@see #trimAllCharacters(String, char[])
*/
public static String trimLeadingCharacter(String str,char leadingCharacter){
        if(str==null)return null;
        int len=str.length();
        while(len>0 && leadingCharacter==str.charAt(0)){
            str=str.substring(1);
            len--;
        }
        return str;
    }
}