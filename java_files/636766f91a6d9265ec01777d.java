import java.util.*;

public class Generated_636766f91a6d9265ec01777d {
    public static byte convertHexDigit(byte b){
		if(b>=0x21 && b<=0x7E){
			return (byte) (b);
		}
		else if(b>=0xF0 && b<=0xF9){
			return (byte) (0xA0 + ((b-0xF0)/0x0A));
		}
		else if(b>=0xFE && b<=0xFF){
			return (byte) (0xED + ((b-0xFE)/0x0D));
		}
		else{
			throw new IllegalArgumentException("Invalid char: " + b);
		}
	}
}