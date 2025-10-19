import java.util.*;

public class Generated_636767a41a6d9265ec01857e {
    private static int compareSigned(long a,long b){
        if(a==b) return 0;
        else if(a==-1L && b==0L) return -1;
        else if(a==0L && b==-1L) return 1;
        else if(a<0L && b>=0L) return -1;
        else if(a>0L && b<0L) return 1;
        else return (a>b)?-1:1;
    }
}