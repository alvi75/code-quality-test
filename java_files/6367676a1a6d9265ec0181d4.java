import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    /**Append a string to a string array.
@param array The array to append to.
@param str The string to append.
@return A new array with the appended string.
@since 1.0
*/
public static String[] addStringToArray(String[] array,String str){
if(array==null)return new String[]{str};
int len=array.length;
String[] result=new String[len+1];
System.arraycopy(array,0,result,0,len);
result[len]=str;
return result;
}
}