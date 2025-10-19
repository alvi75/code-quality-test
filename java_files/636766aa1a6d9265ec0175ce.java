import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,final int numLocal,final int numStack){
        if (numLocal < 0 || numStack < 0) {
            throw new IllegalArgumentException("The number of locals or stacks can not be negative.");
        }
        if ((offset | numLocal | numStack) == 0) {
            return 0;
        }

        this.currentOffset = offset;
        this.currentNumLocal = numLocal;
        this.currentNumStack = numStack;

        visitFrame(VisitStatus.Start, null);

        return 3;
    }
}