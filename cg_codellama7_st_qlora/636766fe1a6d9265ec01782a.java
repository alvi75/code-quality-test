import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
        final int start = getConstantPoolEntryStart(constantPoolEntryIndex);
        final int length = getConstantPoolEntryLength(constantPoolEntryIndex);
        final int end = start + length;
        final int charBufferIndex = 0;
        for(int i = start; i < end; i++){
            charBuffer[charBufferIndex] = (char)classFileBuffer[i];
            charBufferIndex++;
        }
        return new String(charBuffer);
    }
}