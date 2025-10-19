import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		buffer.append("\t\t" + fieldName + " = ");
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				buffer.append("0x" + Integer.toHexString(array[i]));
				if (i < array.length - 1)
					buffer.append(", ");
			}
		} else {
			buffer.append("null");
		}
		buffer.append("\n");
	}
}