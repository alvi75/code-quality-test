import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j=i;
		while(j<bb.limit() && bb.get(j)!=0){
			j++;
		}
		if(j==bb.limit()){
			return -1;
		}
		int len=j-i;
		byte[] octets=new byte[len];
		bb.get(octets,0,len);
		try{
			sb.append(new String(octets,"UTF-8"));
		}catch(UnsupportedEncodingException e){
			throw new RuntimeException(e);
		}
		return j+1;
	}
}