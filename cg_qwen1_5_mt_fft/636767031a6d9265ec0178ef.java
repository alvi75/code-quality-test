import java.util.*;

public class Generated_636767031a6d9265ec0178ef {
    private static Object copyArrayGrow1(final Object array,
                                        final Class<?> newArrayComponentType) {
        if (array == null)
            throw new NullPointerException("Cannot grow a null array");

        int len = Array.getLength(array);
        // make sure we have room for one more element
        Object newArr =
                java.util.Arrays.copyOfRange(array, 0, len + 1, newArrayComponentType);

        return newArr;
    }
}