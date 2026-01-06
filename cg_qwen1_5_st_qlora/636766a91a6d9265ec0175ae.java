import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
      final int byteOffset,final int byteLength){
    if(byteArrayValue == null) {
      throw new IllegalArgumentException("byteArrayValue is null");
    }
    if(byteOffset < 0 || byteLength < 0 ||
        (byteOffset + byteLength) > byteArrayValue.length) {
      throw new IllegalArgumentException(
          "byteOffset or byteLength out of bounds.");
    }

    this.byteVector.putByteArray(byteArrayValue, byteOffset, byteLength);
    return this;
  }
}