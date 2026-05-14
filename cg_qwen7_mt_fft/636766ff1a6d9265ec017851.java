import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
		int b;
		for (int i=pos;i<length;++i) {
			b=getByte(i);
			if(b==value)return i;
		}
		return -1;
	}
}