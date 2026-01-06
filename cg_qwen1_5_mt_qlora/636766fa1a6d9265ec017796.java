import java.util.*;

public class Generated_636766fa1a6d9265ec017796 {
    /**Convert an array of primitive booleans to objects.
@see #toPrimitive(boolean[])
@param array The array to convert.
@return An array of Objects containing the values from the input array.
@since 1.0
*/
public static Boolean[] toObject(final boolean[] array){
return (array == null) ? null : Arrays.copyOf(array, array.length, Boolean[].class);
}
}