import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) throws CharacterCodingException {
    try {
        return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
    }
    catch (CharacterCodingException ex) {
        throw new RuntimeException(ex);
    }
}
}