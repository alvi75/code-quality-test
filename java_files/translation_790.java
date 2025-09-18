import java.util.*;

public class Translation790 {
    public void freeBefore(int pos) {
    assert pos >= 0;
    assert pos <= nextPos;
    final int newCount = nextPos - pos;
    assert newCount <= count;
    assert newCount <= buffer.length;
    nextWrite--;
    while(nextWrite == -1) {
        nextWrite = positions[pos++];
    }
    buffer[nextWrite++] = 0;
}
}