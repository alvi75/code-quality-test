import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		buffer.append("<TR><TD>");
		buffer.append(fieldName);
		buffer.append("</TD><TD>");
		if(array!=null)
			for(int i=0;i<array.length;i++){
				buffer.append(Integer.toHexString((int)array[i]));
			}
		buffer.append("</TD></TR>");
	}
}