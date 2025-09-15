import java.util.*;

public class Translationtranslation_25 {
    public void setParams(String params) {
        super.setParams(params);
        culture = "";
        StringTokenizer st = new StringTokenizer(params, ",");
        if (st.hasMoreTokens()) {
            culture = st.nextToken();
        }
        while (st.hasMoreTokens()) {
            culture += "-" + st.nextToken();
        }
        if (params.contains(OLD_STYLE)) {
            oldStyle = Boolean.parseBoolean(params);
        }
        else if (params.contains(Normal_style)) {
            newStyle = Boolean.parseBoolean(params);
        }
        else if (params.contains(Combination_style)) {
            newStyle = Boolean.parseBoolean(params);
            oldStyle = null;
        }
        else {
            throw new IllegalArgumentException("Unknown parameters: " + params);
        }
    }
}