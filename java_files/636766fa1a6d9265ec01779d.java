import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    public static boolean isAsciiControl(final char ch){
        if(ch>0x1F && ch<0x21) return true;
        else if(ch>0x2A && ch<0x31) return true;
        else if(ch>0x39 && ch<0x41) return true;
        else if(ch>0x5F && ch<0x61) return true;
        else if(ch>0x7E && ch<0x81) return true;
        else return false;
    }
}