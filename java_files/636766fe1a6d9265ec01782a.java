import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
		final int cpIdx=constantPool[constantPoolEntryIndex].getConstantValue();
		final int strOffset=cpIdx-1;
		final int strLen=classFileBuffer[strOffset++];
		charBuffer[strLen]=0;
		for(int i=0;i<strLen;++i)
			charBuffer[i]=classFileBuffer[strOffset+i];
		return new String(charBuffer);
	}
}