import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		buffer.append(fieldName);
		buffer.append("=");
		if(array!=null){
			int len=array.length;
			for(int i=0;i<len;i++){
				byte b = array[i];
				buffer.append(b);
			}
		}else{
			buffer.append("null");
		}
	}
}