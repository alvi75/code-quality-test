import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        if (len == 0) {
            return 1;
        }
        final byte[] bytes = new byte[len];
        for(int i=0;i<len;i++){
            bytes[i] = (byte)str.charAt(index++);
        }

        int count = 0;
        int pos = 0;
        while(pos < len){
            //get first bit
            int b = bytes[pos++] & 0x7f;

            //check if it is a single byte character
            if(b >= 0){
                count++;
                continue;
            }

            //check if it is a two byte character
            b &= 0x3f;
            if(pos >= len){
                throw new IllegalArgumentException("Invalid UTF-8 sequence");
            }
            b |= ((bytes[pos++] & 0x7f) << 6);
            count++;

            //check if it is a three byte character
            if(pos >= len){
                throw new IllegalArgumentException("Invalid UTF-8 sequence");
            }
            b &= 0x1f;
            b |= ((bytes[pos++] & 0x7f) << 12);
            count++;

            //check if it is a four byte character
            if(pos >= len){
                throw new IllegalArgumentException("Invalid UTF-8 sequence");
            }
            b &= 0x0f;
            b |= ((bytes[pos++] & 0x7f) << 18);
            count++;

            //check if it is a five byte character
            if(pos >= len){
                throw new IllegalArgumentException("Invalid UTF-8 sequence");
            }
            b &= 0x07;
            b |= ((bytes[pos++] & 0x7f) << 24);
            count++;
        }
        return count;
    }
}