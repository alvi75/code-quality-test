import java.util.*;

public class Generated_636767ab1a6d9265ec018676 {
    private static boolean isHex(final char c){
        switch(c){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
        }
    }
}