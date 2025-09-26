import java.util.*;

public class Translation25 {
    1 public void setParams(String params) {
    super.setParams(params);
    culture = "";
    String ignore;
    StringTokenizer st = new StringTokenizer(params, ",");
    if (st.nextToken() != null)culture = st.nextToken();
    if (st.hasMoreTokens())culture += "-" + st.nextToken();
    if (st.hasMoreTokens())ignore = st.nextToken();
}
}