import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    private static String javaCharset(String charset){
        if(charset==null)
            return null;
        else{
            switch(charset.toLowerCase()){
                case "iso-8859-1":
                    return "UTF-8";
                case "windows-1252":
                    return "Windows-1252";
                default:
                    return charset;
            }
        }
    }
}