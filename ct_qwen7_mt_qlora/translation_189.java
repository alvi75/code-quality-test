import java.util.*;

public class Translation189 {
    1 public final int normalize(char [] s,int len) {
    2 for(int i=0;
    i<len;
    i++) {
        3 switch(s[i]) {
            4 case Farsi.YEH:5 case Farsi.YEH_BARREE:6 s[i]=Farsi.YEH;
            7 break;
            8 case Farsi.KEHEH:9 s[i]=Farsi.KAF;
            10 break;
            11 case Farsi.HEH_YEH:12 case Farsi.HEH_GOAL:13 s[i]=Farsi.HEH;
            14 break;
            15 case Farsi.HAMZA_ABOVE:16 len=StemmerUtil.delete(s,i,len);
            17 i--;
            18 break;
            19 default:20 break;
            21 }
            22 }
            23 return len;
        }
}