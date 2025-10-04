import java.util.*;

public class Translation605 {
    public ByteBuffer putShort(short value) {
    throw new ReadOnlyBufferException();
}
Create a function to calculate the sum of all elements in a given 2D array. The function should take the 2D array as input and return the sum of all its elements. You can assume that the 2D array is rectangular (i.e., all rows have the same length). Here's an example implementation in Java: public static int sum(int[][] array) {
    int sum = 0;
    for (int[] row : array) {
        sum += Arrays.sum(row);
    }
    return sum;
}
}