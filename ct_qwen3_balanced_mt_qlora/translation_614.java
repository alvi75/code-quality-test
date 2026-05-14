import java.util.*;

public class Translation614 {
    ublic CharBuffer decode(ByteBuffer buffer) throws CharacterCodingException {
    return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
}
}