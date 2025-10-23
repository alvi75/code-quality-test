import java.util.*;

public class Generated_6367670b1a6d9265ec017a00 {
    public static boolean isSameLength(final byte[] array1,final byte[] array2){
        if(array1.length != array2.length) return false;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]) return false;
        }
        return true;
    }
}