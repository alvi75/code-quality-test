import java.util.*;

public class Translation229 {
    public short getGB2312Id( char ch ) throws UnsupportedEncodingException {
    String characterSet = "ISO-8859-1";
    byte[] buffer = characterSet.getBytes();
    char c = ch;
    for(int i=0;
    i<buffer.length;
    ++i) {
        buffer[i] = (byte)c;
    }
    try {
        Integer id = (Integer)_encodingMap.get(new String(buffer));
        if(id == null) {
            return -1;
        }
        else {
            return id.intValue();
        }
    }
    catch(Exception e) {
        throw new RuntimeException(e);
    }
}
}