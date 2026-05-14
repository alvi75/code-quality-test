import java.util.*;

public class Generated_636767791a6d9265ec01826d {
    public static String findAndSubst(String key, Properties props) {
        if (key == null || props == null)
            return "";
        try {
            StringBuffer sb = new StringBuffer();
            Enumeration enm = props.propertyNames();

            while (enm.hasMoreElements()) {
                String name = (String) enm.nextElement();
                if (name.equals(key)) {
                    sb.append(props.getProperty(name));
                    break;
                }
            }

            int i = 0;
            char[] chs = sb.toString().toCharArray();
            boolean isExpanding = false;

            // use a StringBuilder for performance when modifying string.
            StringBuilder buf = new StringBuilder(sb.length());

            while(i < chs.length){
                char c = chs[i++];

                if(c == '$'){
                    if(isExpanding = !isExpanding){
                        continue;
                    }else{
                        continue;
                    }
                }else if(isExpanding){
                    String varName = getVariableName(c);
                    String varValue = System.getProperty(varName);

                    if(varValue != null){
                        buf.append(varValue);
                    }else{
                        buf.append("$" + varName);
                    }
                }else{
                    buf.append(c);
                }
            }

            return buf.toString();
        }catch(Exception e){
            return "";
        }
    }
}