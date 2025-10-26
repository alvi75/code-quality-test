import java.util.*;

public class Translation614 {
    ublic CharBuffer decode(ByteBuffer buffer) {
    try {
        return newDecoder().onMalformedInput(Charset.MALFORMED_CHARACTERS_ON_REPLACEMENT_CHARACTER).onUnmappableCharacter(Charset.UNMAPPABLE_CHARACTERS_ON_REPLACEMENT_CHARACTER).decode(buffer);
    }
    catch (CharacterCodingException ex) {
        throw new RuntimeException(ex);
    }
}
}