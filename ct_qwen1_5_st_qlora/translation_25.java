import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    String culturePart = null;
    String ignorePart = null;
    final String delimiter = ",";
    StringBuffer sb = new StringBuffer();
    for (int i=0;
    i<params.length();
    i++) {
        char c = params.charAt(i);
        switch(c) {
            case ' ':sb.append(c);
            break;
            default:sb.append(c);
        }
        if(sb.toString().endsWith(delimiter))sb.deleteCharAt(sb.length()-1);
        if(sb.toString().equals("culture")) {
            culturePart = sb.toString();
        }
        else if(sb.toString().equals("ignore")) {
            ignorePart = sb.toString();
        }
    }
    culture = culturePart == null ? "" : culturePart.trim();
    ignoreTags = ignorePart == null ? new HashSet<String>() : Arrays.asList(ignorePart.split("\\s+"));
}
}