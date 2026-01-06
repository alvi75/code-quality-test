import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
	public final byte[] toByteArray(){
		byte[] b = new byte[remaining()];
		int remaining = remaining();
		int pos = 0;
		while (remaining > 0){
			int n = Math.min(remaining, buffer.remaining());
			buffer.get(b, pos, n);
			pos += n;
			remaining -= n;
		}
		return b;
	}
}