import java.util.*;

public class Generated_636767691a6d9265ec0181a7 {
    public static String trimLeadingCharacter(String str,char leadingCharacter){ 
    int i;
    for(i=0; i<str.length(); i++)
      if(str.charAt(i)!=leadingCharacter)
        break;
    if(i<str.length())
      return str.substring(i);
    else
      return "";
  }
}