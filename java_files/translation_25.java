import java.util.*;

public class Translation25 {
    ublic void setParams(String params) {
    super.setParams(params);
    culture = "";
    String ignore;
    StringTokenizer st = new StringTokenizer(params,",");
    if (st.hasMoreTokens()) {
        setCulture(st.nextToken());
    }
    else if (st.hasMoreTokens()) {
        ignore = st.nextToken();
    }
    if (st.hasMoreTokens()) {
        throw new IllegalArgumentException("Invalid format of parameters: " + params);
    }
    if (ignore != null) {
        setIgnore(ignore);
    }
}