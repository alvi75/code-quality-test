import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		buffer.append(fieldName).append(" = [");
		for(int i=0;i<array.length;i++){
			buffer.append(array[i]);
			if(i!=array.length-1)buffer.append(",");
		}
		buffer.append("]");
	}
}