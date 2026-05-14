import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int b=bb.get(i);
		if(b<0x80) {
			sb.append((char)b); // 1 byte
			return i+1;
		}
		else if(b>=0xc2&&b<=0xdf) { // 2 bytes
			bb.position(i+1);
			int c=bb.get();
			if(c<0x80||c>0xbf)
				throw new IllegalArgumentException("Invalid UTF-8 sequence");
			sb.append((char)((b&0x1f)<<6)|(c&0x3f));
			return i+2;
		}
		else if(b==0xe0) { // 3 bytes
			bb.position(i+1);
			int c=bb.get(),d=bb.get();
			if(c<0xa0||c>0xbf||d<0x80||d>0xbf)
				throw new IllegalArgumentException("Invalid UTF-8 sequence");
			sb.append((char)(((b&0xf)<<12)|((c&0x3f)<<6)|(d&0x3f)));
			return i+3;
		}
		else if(b>=0xe1&&b<=0xef) { // 3 bytes
			bb.position(i+1);
			int c=bb.get(),d=bb.get();
			if(c<0x80||c>0xbf||d<0x80||d>0xbf)
				throw new IllegalArgumentException("Invalid UTF-8 sequence");
			sb.append((char)(((b&0xf)<<12)|((c&0x3f)<<6)|(d&0x3f)));
			return i+3;
		}
		else if(b==0xf0) { // 4 bytes
			bb.position(i+1);
			int c=bb.get(),d=bb.get(),e=bb.get();
			if(c<0x90||c>0xbf||d<0x80||d>0xbf||e<0x80||e>0xbf)
				throw new IllegalArgumentException("Invalid UTF-8 sequence");
			sb.append((char)(((b&7)<<18)|((c&0x3f)<<12)|((d&0x3f)<<6)|(e&0x3f)));
			return i+4;
		}
}