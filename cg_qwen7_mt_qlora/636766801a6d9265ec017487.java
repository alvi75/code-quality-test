import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s){
        if(s==null)return null;
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        char c;
        for(int i=0;i<len;i++){
            c=s.charAt(i);
            switch(c){
                case '{':
                    sb.append(TEMPLATE_NAME_START_CHAR);
                    break;
                case '}':
                    sb.append(TEMPLATE_NAME_END_CHAR);
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }
}