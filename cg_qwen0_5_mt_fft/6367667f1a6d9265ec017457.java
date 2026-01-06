import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j=0;
		for(;i<bb.remaining();i++){
			char c=bb.getChar(i);
			if(c>127){
				sb.append((char)c);
				continue;
			}
			if(j>=sb.length()){
				sb.append(' ');
				j=0;
			}
			sb.setCharAt(j++,c);
		}
		return i;
	}
}