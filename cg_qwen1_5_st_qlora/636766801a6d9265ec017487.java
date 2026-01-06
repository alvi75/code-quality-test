import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s){
        if(s==null)return null;
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;++i){
            char c=s.charAt(i);
            switch(c){
                case '{':
                    sb.append("{");
                    break;
                case '}':
                    sb.append("}");
                    break;
                default:
                    sb.append(c);
            }
        }
        return sb.toString();
    }
}