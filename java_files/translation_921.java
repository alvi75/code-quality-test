import java.util.*;

public class Translation921 {
    0;
int remaining = _limit - _position;
if (remaining == 0) {
    throw new java.nio.ReadOnlyBufferException();
}
return new java.nio.ReadOnlyFloatArrayBuffer(remaining, backingArray, offset + _position);
}
}