import java.util.*;

public class Translation678 {
    1 public static int prev(byte[] b, int ptr, byte chrA) {
    2 if (ptr == b.length) {
        3 --ptr;
        4 }
        5 while (ptr >= 0) {
            6 if (b[ptr--] == chrA) {
                7 return ptr;
                8 }
                9 }
                10 return ptr;
            }
}