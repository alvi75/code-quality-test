import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
        if(data.length<index+2){
            byte[] newData=new byte[data.length*2+2];
            System.arraycopy(data,0,newData,0,index);
            data=newData;
        }
        data[index++]=(byte)byteValue1;
        data[index++]=(byte)byteValue2;
        return this;
    }
}