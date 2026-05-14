import java.util.*;

public class Translation875 {
    1 public FloatBuffer slice() {
    2 final int remaining = remaining();
    3 if (remaining == 0) {
        4 return emptyFloatBuffer();
        5 }
        6 final int sizeInBytes = remaining << 2;
        7 final ByteBuffer bb = this.duplicate();
        8 bb.limit(bb.position() + sizeInBytes);
        9 bb.position(bb.position() + sizeInBytes - remaining);
        10 return bb.asFloatBuffer();
    }
}