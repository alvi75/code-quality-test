import java.util.*;

public class Translationtranslation_25 {
    public void setParams(String params) {
        super.setParams(params);
        StringTokenizer st = new StringTokenizer(params, ",");
        while (st.hasMoreTokens()) {
            String param = st.nextToken();
            String value = st.nextToken();
            if (param.equals("ignoreCase")) {
                setIgnoreCase(Boolean.parseBoolean(value));
            }
            else {
                throw new IllegalArgumentException("Unknown parameter " + param + " with value " + value);
            }
        }
    }
}