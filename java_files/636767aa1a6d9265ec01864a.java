import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    public byte[] toByteArray(){
		byte[] b=new byte[size()];
		int pos=0;
		for(int i=0;i<blocks.length;i++){
			b[pos++]=blocks[i].get();
		}
		if(pos!=size())throw new RuntimeException("Internal error");
		return b;
	}
}