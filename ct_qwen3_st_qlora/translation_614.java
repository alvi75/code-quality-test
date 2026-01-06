import java.util.*;

public class Translation614 {
    ublic CharBuffer decode(ByteBuffer buffer) {
    try {
        return newDecoder().onMalformedInput(CharacterCodingException.REPLACE) .onUnmappableCharacter(CharacterCodingException.REPLACE) .decode(buffer);
    }
    catch (CharacterCodingException ex) {
        throw new RuntimeException(ex);
    }
}
}