import java.util.*;

public class Generated_636767a41a6d9265ec01856c {
    public static int computeUTF8Size(final CharSequence str,final int index,final int len){
        final int end = Math.min(index+len,str.length());
        int i = index;
        int size = 0;
        while(i<end){
            char c = str.charAt(i++);
            if(c>127){
                do{
                    ++size;
                }while((c&0x40)!=0&&(c=str.charAt(i++))>127);
            }
            ++size;
        }
        return size;
    }
}