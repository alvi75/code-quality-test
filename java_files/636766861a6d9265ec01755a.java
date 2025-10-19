import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null)
            throw new IllegalArgumentException("Null URI");

        Matcher m = matcher(uri);
        if (!m.find())
            return null;

        // System.out.println(m.group(0));
        Map<String,String> map = new HashMap<>();
        for (int i=1; i<=groupCount(); ++i){
            String s = m.group(i);
            if (s != null && !"".equals(s))
                map.put(groupName(i), s);
        }
        return new MatchResult(map);
    }
}