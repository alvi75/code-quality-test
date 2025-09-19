import java.util.*;

public class Translation577 {
    public boolean contains(Object o) {
    if (!(o instanceof CharBuffer)) {
        return false;
    }
    CharBuffer otherBuffer = (CharBuffer) o;
    if (remaining() != otherBuffer.remaining()) {
        return false;
    }
    int myPosition = position;
    int otherPosition = otherBuffer.position;
    boolean equalSoFar = true;
    while (equalSoFar && (myPosition < limit)) {
        equalSoFar = get(myPosition++) == otherBuffer.get(otherPosition++);
    }
}
return equalSoFar;
}
}