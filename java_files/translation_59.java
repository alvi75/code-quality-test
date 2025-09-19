import java.util.*;

public class Translation59 {
    public void unsetSection(String section, String name) {
    final Config rc = getState().getConfig();
    if (rc.getSections().contains(section)) {
        List<String> vlst = new ArrayList<>();
        vlst.clear();
        for (URIish u : rc.getURIs())vlst.add(u.setSection(name));
        config.set(rc, "uris", vlst);
    }
}
}