import java.util.*;

public class Translation867 {
    1 public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
    2 byteBuffer().limit(limit() << Short.SIZE);
    3 byteBuffer().position(position() << Short.SIZE);
    4 if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        5 ((ReadWriteDirectByteBuffer) byteBuffer()).put(src, srcOffset, shortCount);
        6 }
        else {
            7 ((ReadWriteHeapByteBuffer) byteBuffer()).put(src, srcOffset, shortCount);
            8 }
            9 position(position() + shortCount);
            10 return this;
        }
}