import java.util.*;

public class Translationtranslation_790 {
    public void freeBefore(int pos) {
        assert pos >= 0;
        assert pos <= nextPos;
        final int newCount = nextPos - pos;
        assert newCount <= count;
        assert newCount <= buffer.length;
        nextWrite--;
        while(nextWrite == -1) {
            nextWrite = positions[pos];
        }
        pos = nextWrite;
        nextPos = positions[nextWrite];
        positions[nextWrite] = 0;
        count = Math.min(nextPos - pos, count);
        assert positions[nextWrite] == 0;
    }
}