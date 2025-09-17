import java.util.*;

public class Translationtranslation_466 {
    public int readUByte() {
        checkPosition(1);
        return (buf[_readIndex++] & 0xFF);
    }
}