import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    /**Convert a value in a vs array to a string**/
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i=0;i<values.length;i++){
			if(i>0) sb.append(",");
			sb.append(values[i].toString());
		}
		sb.append("]");
		return sb.toString();
	}
}