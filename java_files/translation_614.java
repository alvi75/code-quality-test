import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) throws CharacterCodingException {
    return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
}
}