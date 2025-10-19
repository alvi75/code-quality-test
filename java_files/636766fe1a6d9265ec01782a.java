import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
        final byte[] bytes = new byte[constantPoolEntryIndex - 1];
        this.classFileBuffer.get(bytes);
        return new String(charBuffer,0,bytes.length);
    }
}