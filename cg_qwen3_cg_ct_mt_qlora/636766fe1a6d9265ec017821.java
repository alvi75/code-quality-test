import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**Append a byte array to a buffer.**/
protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		if (array==null) {
			buffer.append(fieldName).append(" = null");
		} else {
			buffer.append(fieldName).append(" = ").append(new String(array));
		}
	}
}