import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		buffer.append(fieldName);
		buffer.append("=");
		if(array==null){
			buffer.append("null");
		}else{
			for(int i=0;i<array.length;i++){
				buffer.append(Integer.toHexString(array[i]));
			}
		}
	}
}