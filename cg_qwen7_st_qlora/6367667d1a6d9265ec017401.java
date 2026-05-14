import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() < 2)
            return str;
        
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for(int i=0; i<len; ++i){
            char c = str.charAt(i);
            if(c == '\\'){
                if(++i >= len)
                    throw new Exception("Invalid escape sequence: \\ at end of string");
                
                c = str.charAt(i);
                switch(c){
                    case 'b': sb.append('\b'); break;
                    case 't': sb.append('\t'); break;
                    case 'n': sb.append('\n'); break;
                    case 'f': sb.append('\f'); break;
                    case 'r': sb.append('\r'); break;
                    case '"': sb.append('"'); break;
                    case '\'': sb.append('\''); break;
                    case '\\': sb.append('\\'); break;
                    default:
                        // Unicode escape sequences
                        if(c == 'u' && i+4 <= len){
                            int unicode = Integer.parseInt(str.substring(i+1, i+5), 16);
                            sb.append((char)unicode);
                            i += 4;
                        } else {
                            throw new Exception("Invalid escape sequence: \\" + c);
                        }
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}