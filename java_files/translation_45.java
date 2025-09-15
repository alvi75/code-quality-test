import java.util.*;

public class Translationtranslation_45 {
    public URLConnection open(URIish uri)throws NotSupportedException, TransportException {
        if (uri.getScheme().equals("file"))throw new NotSupportedException(uri.getScheme() + " is not supported");
        URLConnection c = open(uri);
        try {
            c.connect();
        }
        catch (ConnectException ce) {
            throw new TransportException(uri, ce);
        }
        return c;
    }
}