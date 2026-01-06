import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len){
		if(len > this.len) {
			return false;
		}
		
		for(int i = 0; i < len; i++) {
			if(this.bytes[i + offset] != data[i]) {
				return false;
			}
		}

		return true;
	}
}