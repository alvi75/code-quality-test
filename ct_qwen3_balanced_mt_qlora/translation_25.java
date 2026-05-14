import java.util.*;

public class Translation25 {
    ublic void setParams(String params) {
    super.setParams(params);
    String culture = "";
    StringTokenizer st = new StringTokenizer(params, ",");
    if (st.hasMoreTokens()) {
        culture = st.nextToken();
    }
    if (st.hasMoreTokens()) {
        culture += "-" + st.nextToken();
    }
    if (st.hasMoreTokens()) {
        ignore = st.nextToken();
    }
}
}