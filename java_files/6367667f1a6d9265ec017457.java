import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j=0;
		while(i<bb.limit() && (j=bb.getChar(j))!=0)
			sb.append((char)j);
		return i+1;
	}
}