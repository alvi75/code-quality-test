import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) {
    try {
        return newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(buffer);
    }
    catch (CharacterCodingException ex) {
        throw new RuntimeException(ex);
    }
}
}