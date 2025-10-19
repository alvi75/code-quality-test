import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j = i;
		while(j>=0){
			byte b = bb.get(j);
			if(b>=(byte)0x80){
				j--;
				sb.append((char)(b & 0x7f));
			}
			else{
				j-=2;
				sb.append((char)(((b & 0x3f)<<6)|(bb.get(j)&0x3f)));
			}
			j--;
		}
		return j;
	}
}