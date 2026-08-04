import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public virtual void PutByteArray(byte[] byteArrayValue,int byteOffset,int byteLength){if (byteArrayValue == null){throw new ArgumentNullException("byteArrayValue");}if (byteOffset < 0){throw new ArgumentOutOfRangeException("byteOffset");}if (byteLength < 0){throw new ArgumentOutOfRangeException("byteLength");}if (byteOffset + byteLength > byteArrayValue.Length){throw new ArgumentException("byteOffset + byteLength > byteArrayValue.Length");}if (byteOffset + byteLength > _length){Enlarge(byteOffset + byteLength);}Array.Copy(byteArrayValue, byteOffset, _buffer, _length, byteLength);_length += byteLength;}
}