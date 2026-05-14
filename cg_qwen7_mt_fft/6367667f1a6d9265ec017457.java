import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb) {
        if (i == 0)
            return -1;
        else if (i < 0x80)
            return i;
        else if ((i & 0xe0) == 0xc0) {
            try {
                int b2 = bb.get() & 0xff;
                if ((b2 & 0xc0) != 0x80)
                    throw new CharConversionException("illegal utf8 encoding");
                sb.append((char)((i & 0x1f) << 6 | (b2 & 0x3f)));
                return 2;
            } catch (BufferUnderflowException e) {
                throw new CharConversionException(e);
            }
        }
        else if ((i & 0xf0) == 0xe0) {
            try {
                int b2 = bb.get() & 0xff;
                if ((b2 & 0xc0) != 0x80)
                    throw new CharConversionException("illegal utf8 encoding");
                int b3 = bb.get() & 0xff;
                if ((b3 & 0xc0) != 0x80)
                    throw new CharConversionException("illegal utf8 encoding");
                sb.append((char)((i & 0x1f) << 12 | ((b2 & 0x3f) << 6) | (b3 & 0x3f)));
                return 3;
            } catch (BufferUnderflowException e) {
                throw new CharConversionException(e);
            }
        }
        else
            throw new CharConversionException("illegal utf8 encoding at ("+Integer.toHexString(i)+")");
    }
}