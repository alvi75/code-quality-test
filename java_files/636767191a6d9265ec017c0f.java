import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
		if(size<0)throw new IllegalArgumentException("size must be positive");
		final int oldSize = this.data.length;
		this.data = Arrays.copyOf(this.data,oldSize+size);
	}
}