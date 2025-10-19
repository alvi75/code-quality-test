import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j = 0;
		if(i<256){
			sb.append((char)i);
			return i+1;
		}
		
		while(j<3){
			i = bb.get(i);
			sb.append((char)(i&0xff));
			j++;
			
			if(i<256){
				break;
			}
			i >>= 8;
		}
		
		return j;
	}
}