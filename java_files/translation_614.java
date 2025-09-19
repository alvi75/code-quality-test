import java.util.*;

public class Translation614 {
    public CharBuffer decode(ByteBuffer buffer) {
    try {
        return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
    }
    else if (buffer.hasErrors()) {
        throw new Error(buffer.errors());
    }
}
}