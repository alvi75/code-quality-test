import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j=0;
		while(j<bb.limit()){
			if(bb.get(j)<'A'){break;}j++;
		}
		sb.append(new String(bb.array(),i,j));
		return j;
	}
}