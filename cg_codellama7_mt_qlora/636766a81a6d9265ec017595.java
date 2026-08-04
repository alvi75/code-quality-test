import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    public ByteVector put11(int byteValue1, int byteValue2) {
        byte[] data = this.data;
        int length = this.length;
        if (length + 2 > data.length) {
            byte[] newData = new byte[length + 2];
            System.arraycopy(data, 0, newData, 0, length);
            this.data = data = newData;
        }
        data[length++] = (byte) byteValue1;
        data[length++] = (byte) byteValue2;
        this.length = length;
        return this;
    }
}