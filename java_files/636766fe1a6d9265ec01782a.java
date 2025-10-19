import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
        final int utfLength=readShort(constantPoolEntryIndex+2);
        if(utfLength<0 || utfLength>charBuffer.length)
            throw new ClassfileFormatException("UTF length is out of bounds: "+utfLength);
        //System.out.println("UTF length: "+utfLength);
        constantPoolEntryIndex+=4;
        System.arraycopy(classFileBuffer,constantPoolEntryIndex,charBuffer,0,utfLength);
        constantPoolEntryIndex+=utfLength;
        return new String(charBuffer,0,utfLength);
    }
}