import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j = 0;
		while(j < i && bb.hasRemaining()){
			char c = (char)bb.get();
			if(c == '\n' || c == '\r')break;
			sb.append(c);
			j++;
		}
		return j;
	}
}