import java.util.*;

public class Translation721 {
    2 public ByteBuffer read(final int length, final long position) throws IOException {
    3 if (position >= size())4 throw new IllegalArgumentException("Position " + position + " past the end of the file");
    5 ByteBuffer dst;
    6 int worked = -1;
    7 if (isWritable())8 {
        9 dst = ByteBuffer.allocateDirect(length);
        10 worked = 0;
        11 }
        else12 {
            13 fileChannel.position(position);
            14 dst = ByteBuffer.allocateDirect(length);
            15 worked = fileChannel.read(dst);
            16 }
            17 if (worked == -1)18 throw new IllegalArgumentException("Position " + position + " past the end of the file");
            19 dst.flip();
            20 return dst;
        }
}