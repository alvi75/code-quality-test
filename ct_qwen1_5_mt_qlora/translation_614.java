import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) {
    try {
        return decoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
    }
    catch (CharacterCodingException e) {
        throw new IllegalArgumentException(e.getMessage(), e);
    }
}
}