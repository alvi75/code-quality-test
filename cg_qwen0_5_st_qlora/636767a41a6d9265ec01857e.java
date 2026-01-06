import java.util.*;

public class Generated_636767a41a6d9265ec01857e {
    private static int compareSigned(long a,long b){
        if(a==b) return 0;
        if(a<0 && b<0) return -1;
        if(a>0 && b>0) return 1;
        return Integer.compare((int)a,(int)b);
    }
}