import java.util.*;

public class Generated_636766f01a6d9265ec01762e {
    public static boolean isEmpty(final double[] array) {
        if (array == null || array.length == 0)
            return true;
        for (double v : array)
            if (v != 0)
                return false;
        return true;
    }
}