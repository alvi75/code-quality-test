import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s){
        if(s==null)return null;
        return s.replace('{', TemplateConstants.TEMPLATE_NAME_START).replace('}', TemplateConstants.TEMPLATE_NAME_END);
    }
}