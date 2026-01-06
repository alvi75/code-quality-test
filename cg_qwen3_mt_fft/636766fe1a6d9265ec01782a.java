import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.**/
final String readUtf(final int constantPoolEntryIndex,char[] charBuffer){
		int index=constantPoolEntryIndex*2+1;
		int len=classFileBuffer[index];
		if(charBuffer.length<len)len=charBuffer.length;
		System.arraycopy(classFileBuffer,index+1,charBuffer,0,len);
		return new String(charBuffer,0,len);
	}
}