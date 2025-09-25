import java.util.*;

public class Translation805 {
    public ReadOnlyIntArrayBuffer slice() {
    return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position);
}
}