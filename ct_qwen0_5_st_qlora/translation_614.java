import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) {
    try {
        return decoder.onMalformedInput(REPLACE).onUnmappableCharacter(REPLACE).decode(buffer);
    }
    catch (CharacterCodingException e) {
        throw new RuntimeException(e);
    }
}
}