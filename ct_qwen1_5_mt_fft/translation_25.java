import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    culture = "";
    final StringTokenizer st = new StringTokenizer(params, ",");
    while (st.hasMoreTokens()) {
        final String s = st.nextToken();
        if ("ignore".equals(s))ignore = s;
        else if (!s.isEmpty()) {
            if (s.startsWith("case")){
                caseLocale = s.substring(4).trim();
            }
            else {
                culture = s.trim();
            }
        }
    }
}
}