import java.util.*;

public class Translation972 {
    0;
int end = start + length;
if (end > value.length) {
    throw new System.ArgumentException("value is too long");
}
System.arraycopy(value, start, this.value.bytes, 0, end - start);
this.value.offset = 0;
this.value.length = end;
}
}