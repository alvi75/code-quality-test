import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    this.culture = "";
    StringTokenizer st = new StringTokenizer(params,",");
    if (st.hasMoreTokens()) this.culture = st.nextToken();
    if (st.hasMoreTokens()) this.culture += "-" + st.nextToken();
    if (st.hasMoreTokens()) ignore = st.nextToken();
}
}