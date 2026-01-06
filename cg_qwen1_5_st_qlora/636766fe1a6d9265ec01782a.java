import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                        final char[] charBuffer) {
        final int offset = constantPoolOffset + constantPools[constantPoolEntryIndex];
        final int length = (int)(charBuffer[offset] & 0xff);
        final int end = offset + length;
        for(int i=offset; i<end; ++i){
            charBuffer[i] = (char)((charBuffer[i]&0xff) | ((charBuffer[i+1]&0xff)<<8));
            ++i;
        }
        return new String(charBuffer, offset, length);
    }
}