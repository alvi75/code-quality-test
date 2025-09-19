import java.util.*;

public class Translation25 {
    public void setLocale(String params) {
    super.setLocale(params);
    locale = null;
    StringTokenizer st = new StringTokenizer(params, ",");
    if (st.hasMoreTokens()) {
        locale = st.nextToken();
        if (st.hasMoreTokens()) {
            st.nextToken();
            st = new StringTokenizer(st.nextToken(), ":");
            if (st.hasMoreTokens()) {
                st.nextToken();
                st = new StringTokenizer(st.nextToken(), ",");
                if (st.hasMoreTokens()) {
                    throw new IllegalArgumentException("too many parameters: " + params);
                }
                setTimeZone(getTimeZoneId());
                return;
            }
            throw new IllegalArgumentException("Invalid format for locale parameter: " + params);
        }
        st = new StringTokenizer(params, ",");
        if (st.hasMoreTokens()) {
            tzid = st.nextToken();
            if (st.hasMoreTokens()) {
                st.nextToken();
                st = new StringTokenizer(st.nextToken(), ":");
                if (st.hasMoreTokens()) {
                    st.nextToken();
                    st = new StringTokenizer(st.nextToken(), ",");
                    if (st.hasMoreTokens()) {
                        throw new IllegalArgumentException("too many parameters: " + params);
                    }
                    setTimeZone(tzid);
                    return;
                }
                throw new IllegalArgumentException("Invalid format for time zone parameter: " + params);
            }
        }
}