import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
		int newsize = this.data.length + size;
		byte[] temp = new byte[newsize];
		System.arraycopy(this.data, 0, temp, 0, this.data.length);
		this.data = temp;
	}
}