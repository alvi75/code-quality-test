import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray(){
		if (this.size == 0) {
			return new byte[0];
		}
		byte[] result = new byte[this.size];
		int offset = this.start;
		for(int i=0;i<this.size;i++){
			result[i] = get(offset);
			offset++;
		}
		return result;
	}
}