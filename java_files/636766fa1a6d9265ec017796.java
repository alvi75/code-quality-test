import java.util.*;

public class Generated_636766fa1a6d9265ec017796 {
    /**Convert an array of primitive booleans to objects.**/
    public static Boolean[] toObject(final boolean[] array){
        if(array == null) return null;
        final Boolean[] newArray = new Boolean[array.length];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
}