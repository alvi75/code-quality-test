import java.util.*;

public class Generated_636767aa1a6d9265ec01864a {
    public byte[] toByteArray(){
		byte[] b=new byte[this.length()];
		int i=0;
		for(BinChunk c:this.chunks){
			System.arraycopy(c.bytes, 0, b, i, c.length());
			i+=c.length();
		}
		return b;
	}
}