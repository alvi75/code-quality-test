import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**Read raw varint**/
    public long readRawVarint64() throws IOException {
        int tmp;
        if ((tmp = readRawByte()) >= 0) return (long) tmp;
        long result = tmp & 0x7F;
        if ((tmp = readRawByte()) >= 0) {
            result |= tmp << 7;
        } else {
            result |= (tmp & 0x7F) << 7;
            if ((tmp = readRawByte()) >= 0) {
                result |= tmp << 14;
            } else {
                result |= (tmp & 0x7F) << 14;
                if ((tmp = readRawByte()) >= 0) {
                    result |= tmp << 21;
                } else {
                    result |= (tmp & 0x7F) << 21;
                    result |= (long) readRawByte() << 28;
                    //result |= (long) readRawByte() << 35;
                    //result |= (long) readRawByte() << 42;
                    //result |= (long) readRawByte() << 49;
                    //result |= (long) readRawByte() << 56;
                    //result |= (long) readRawByte() << 63;
                }
            }
        }
        return result;
    }
}