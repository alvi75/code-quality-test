import java.util.*;

public class Translation25 {
    public void setParams(String params) {
    super.setParams(params);
    culture = "";
    String[] st = params.split(",");
    if (st.length > 0)culture = st[0];
    if (st.length > 1)culture += "-" + st[1];
    if (st.length > 2)throw new IllegalArgumentException("invalid params");
}
}