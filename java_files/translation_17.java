import java.util.*;

public class Translation17 {
    public CharsetDecoder(Charset charset, int maxBytesPerCall, java.nio.charset.CodingErrorAction action) {
    super(action);
    if (charset == null) {
        throw new NullPointerException();
    }
    this.charset = charset;
    this.maxBytesPerCall = maxBytesPerCall;
}
}