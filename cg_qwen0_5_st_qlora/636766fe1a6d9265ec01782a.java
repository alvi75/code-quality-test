import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        // Read the UTF-8 string from the constant pool.
        final int utfLength = this.constantPool.getConstant(constantPoolEntryIndex)
                .getU2();
        if (utfLength == 0) {
            return "";
        }
        final byte[] bytes = new byte[utfLength];
        this.constantPool.getConstant(constantPoolEntryIndex).getBytes(bytes);
        final String result = new String(bytes, "UTF-8");
        System.arraycopy(result.toCharArray(), 0, charBuffer, 0, utfLength);
        return result;
    }
}