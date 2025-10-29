import java.util.*;

public class Translation790 {
    01 public void freeBefore(int pos) {
    02 assert pos >= 0;
    03 assert pos <= nextPos;
    04 int newCount = nextPos - pos;
    05 assert newCount <= count, "newCount=" + newCount + " count=" + count;
    06 assert newCount <= buffer.length, "newCount=" + newCount + " buf.length=" + buffer.length;
    07 count = newCount;
}
}