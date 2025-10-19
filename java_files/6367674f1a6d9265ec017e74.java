import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    /**Convert a value in a vs array to a string**/
public String toString(){
		if (this.value == null) return "";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<this.value.length;i++){
			sb.append(this.value[i]);
			if(i != this.value.length-1)
				sb.append(",");
		}
		return sb.toString();
	}
}