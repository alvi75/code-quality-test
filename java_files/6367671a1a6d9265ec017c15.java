import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,
      final int byteOffset,final int byteLength){
    ensureCapacity(byteArrayValue.length);
    System.arraycopy(byteArrayValue,byteOffset,bytes,offset,byteLength);
    offset+=byteLength;
    return this;
  }
}