import java.util.*;

public class Translation614 {
    1 public CharBuffer decode(ByteBuffer buffer) {
    2 try {
        3 return getDecoder()4 . onMalformedInput(CodingErrorAction.REPLACE)5 . onUnmappableCharacter(CodingErrorAction.REPLACE)6 . decode(buffer);
        7 }
        catch (CharacterCodingException x) {
            8 throw new RuntimeException(x.getMessage(), x);
            9 }
        }
}