import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    locale = "";
    StringTokenizer st = new StringTokenizer(params, ",");
    if (st.hasMoreTokens())locale = st.nextToken();
    else locale = null;
}
}