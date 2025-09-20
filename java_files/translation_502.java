import java.util.*;

public class Translation502 {
    ublic Iterator<E> iterator() {
    final Object[] snapshot = elements;
    return new Iterator<E>() {
        Object[] block = snapshot;
        int blockIndex = 0;
        int positionInBlock = 0;
        @Override
}