import java.util.*;

public class Translation321 {
    public ObjectStream openStream() throws IOException {
    final WindowCursor wc = new WindowCursor(db);
    final InputStream in;
    try {
        in = new PackInputStream( pack, objectOffset+headerLength, wc );
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    final boolean isDelta = in instanceof DeltaInputStream;
    final int bufferSize = 8192;
    final byte[] buffer = new byte[bufferSize];
    ObjectStream s = null;
    while ( true ) {
        s = db.openObjectStream(id, type);
        if ( s != null ) break;
        s.close();
    }
    assert s != null;
    final InputStream stream = s.open(in);
    stream.mark(bufferSize);
    boolean sawEOF = false;
    int read;
    try {
        while ( (read = stream.read(buffer)) > 0 ) {
            if ( isDelta && !sawEOF ) {
                final long pos = s.getPosition();
                final int len = Math.min(read, bufferSize);
                stream.skip(len);
                s.setPosition(pos + len);
                continue;
            }
            s.add(buffer, 0, read);
        }
    }
    finally {
        stream.reset();
        s.close();
    }
    s.setLength(s.getPosition());
    s.position(0);
    s.sawEOF = sawEOF;
    if (isDelta) {
        s = db.newObjectStream(id, type, s.getLength());
        s.setLastModified(System.currentTimeMillis());
        s.setSawEOF(sawEOF);
        s.position(0);
    }
    else if (sawEOF) {
        s = null;
    }
    return s;
}
}