import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
		final int oldSize = this.data.length;
		if(oldSize == 0 || oldSize >= maxSize)
			throw new IllegalStateException("Cannot enlarge buffer beyond maximum size");
		
		final int newSize = Math.max(maxSize,oldSize+size);
		this.data = Arrays.copyOf(this.data,newSize);
	}
	
	public void add(byte b) {
		enlarge(1);
		data[size++] = b;
	}
}