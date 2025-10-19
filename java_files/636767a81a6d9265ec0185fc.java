import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        //read first byte.
        final byte b = readByte();
        //if it's not the start of the tag, return -1.
        if (b != START_TAG) {
            return -1;
        }
        //read next bytes until we find the end of the tag.
        while (true) {
            //get the next byte.
            final byte c = readByte();
            //if it's the end of the tag, break out of the loop.
            if (c == END_TAG) {
                break;
            }
            //shift left one bit in the last byte.
            b = (b << 1) & 0xFF;
            //if the last byte is 0x80, then it means that the next byte is the length of the tag.
            if ((b & 0x80) == 0x80) {
                //get the next byte.
                final byte d = readByte();
                //shift left one bit in the last byte.
                b = (b << 1) & 0xFF;
                //if the last byte is 0x80, then it means that the next byte is the length of the tag.
                if ((d & 0x80) == 0x80) {
                    //get the next byte.
                    final byte e = readByte();
                    //shift left one bit in the last byte.
                    b = (b << 1) & 0xFF;
                    //if the last byte is 0x80, then it means that the next byte is the length of the tag.
                    if ((e & 0x80) == 0x80) {
                        //get the next byte.
                        final byte f = readByte();
                        //shift left one bit in the last byte.
                        b = (b << 1) & 0xFF;
                        //if the last byte is 0x80, then it means that the next byte is the length of the tag.
                        if ((f & 0x80) == 0x80) {
                            //get the next byte.
                            final byte g = readByte();
                            //shift left one bit in the last byte.
                            b = (b << 1) & 0xFF;
                            //if the last byte is 0x80, then it means that the next byte is the length
}