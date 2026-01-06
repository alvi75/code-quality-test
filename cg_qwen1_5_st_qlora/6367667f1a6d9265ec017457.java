import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.
 * @param i
 * @param bb
 * @param sb
 * @return
 */
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        if(i>=bb.limit())throw new IllegalArgumentException("Index "+i+" is out of bounds");
        //if(i<0)throw new IllegalArgumentException("Index "+i+" is negative");
        int j=i;
        while(j<i+4 && (bb.get(j)&0x80)!=0){
            j++;
        }
        if(j==i+1){
            throw new IllegalArgumentException("Invalid UTF-8 sequence: 0x"+Integer.toHexString(bb.get(i)));
        }else{
            try {
                String s=new String(bb.array(),i,j-i);
                sb.append(s);
                return j+1;
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}