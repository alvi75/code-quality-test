import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
		int i = 0;
		for (int j = pos; j < size; j++) {
			if (buffer[j] == value) {
				return j;
			}
		}
		return -1;
	}
}