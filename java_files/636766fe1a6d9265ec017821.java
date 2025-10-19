import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		if (array.length>0){
			buffer.append("\t");
			for (int i=0;i<array.length;i++){
				buffer.append(array[i]&0xFF);
				if ((i+1)<array.length)
					buffer.append(" ");
			}
			buffer.append(",");
			buffer.append(fieldName);
			buffer.append(":[");
			buffer.append(Integer.toHexString(hashCode()));
			buffer.append("]");
		}
	}
}