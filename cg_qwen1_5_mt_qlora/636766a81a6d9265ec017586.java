import java.util.*;

public class Generated_636766a81a6d9265ec017586 {
    /**Pop the given number of elements from the stack.
@throws IllegalStateException if there is no element to pop.
@throws IllegalArgumentException if the number of elements to pop is negative.*/
public void pop(int elements) {
        if (elements < 0)
            throw new IllegalArgumentException("Number of elements to pop must be non-negative");
        if (elements == 0)
            return;
        if (elements > size())
            throw new IllegalStateException("Not enough elements in stack");
        for (int i = 0; i < elements; ++i)
            pop();
    }
}