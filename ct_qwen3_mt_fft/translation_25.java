import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    ignoreCase = false;
    caseInsensitive = false;
    ignoreSpace = false;
    caseIgnore = false;
    StringTokenizer st = new StringTokenizer(params, ",");
    if (st.hasMoreTokens()) {
        ignoreCase = Boolean.parseBoolean(st.nextToken());
    }
    if (st.hasMoreTokens()) {
        caseInsensitive = Boolean.parseBoolean(st.nextToken());
    }
    if (st.hasMoreTokens()) {
        ignoreSpace = Boolean.parseBoolean(st.nextToken());
    }
    if (st.hasMoreTokens()) {
        caseIgnore = Boolean.parseBoolean(st.nextToken());
    }
}
}