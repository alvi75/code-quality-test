import java.util.*;

public class Generated_636767a51a6d9265ec01859d {
    public boolean equals(final byte[] data,int offset,final int len){
		if(len!=length)
			return false;
		for(int i=0;i<len;++i){
			if(data[offset+i]!=bytes[i])
				return false;
		}
		return true;
	}
}