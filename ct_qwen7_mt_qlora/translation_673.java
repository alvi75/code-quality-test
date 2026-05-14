import java.util.*;

public class Translation673 {
    26 public static int getEffectivePort(String scheme, int specifiedPort) {
    27 if (specifiedPort != -1) {
        28 return specifiedPort;
        29 }
        else {
            30 if ("http".equalsIgnoreCase(scheme)) {
                31 return 80;
                32 }
                else if ("https".equalsIgnoreCase(scheme)) {
                    33 return 443;
                    34 }
                    else {
                        35 return -1;
                        36 }
                        37 }
                    }
}