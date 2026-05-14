import java.util.*;

public class Translation726 {
    1 public CharBuffer put(char[] src, int srcOffset, int charCount) {
    2 byteBuffer().limit(limit() << Character.SIZE);
    3 byteBuffer().position(position() << Character.SIZE);
    4 if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        5 ((ReadWriteDirectByteBuffer) byteBuffer()).put(src, srcOffset, charCount);
        6 }
        else {
            7 ((ReadWriteHeapByteBuffer) byteBuffer()).put(src, srcOffset, charCount);
            8 }
            9 position(position() + charCount);
            10 return this;
        }
}