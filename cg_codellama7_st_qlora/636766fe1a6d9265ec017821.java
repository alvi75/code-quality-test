import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array){
		if(array==null)
			buffer.append(fieldName).append(":null");
		else{
			buffer.append(fieldName).append(":");
			for(int i=0;i<array.length;i++)
				buffer.append(array[i]);
		}
	}
}