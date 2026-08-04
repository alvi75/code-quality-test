import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue==null){
            putInt(0);
        }else{
            putInt(byteLength);
            putByteArray(byteArrayValue,byteOffset,byteLength);
        }
        return this;
    }
}