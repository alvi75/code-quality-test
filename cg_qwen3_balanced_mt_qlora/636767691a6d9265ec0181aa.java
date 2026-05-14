import java.util.*;

public class Generated_636767691a6d9265ec0181aa {
    public static int nullSafeHashCode(long[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = MULTIPLIER * result + Long.hashCode(array[i]);
		}
		return result;
	}
}