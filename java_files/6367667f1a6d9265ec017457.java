import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        if(i==0) {
            return 1;
        }
        else{
            char c = (char)(i&0xFF);
            sb.append(c);
            return 2;
        }
    }
}