import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,
                       final int numLocal,
                       final int numStack) {
        if (offset < 0 || offset > frameSize)
            throw new IllegalArgumentException("Invalid offset: " + offset);
        if (numLocal < 0 || numLocal > MAX_LOCAL_STACK_SIZE)
            throw new IllegalArgumentException("Invalid local stack size: " + numLocal);
        if (numStack < 0 || numStack > MAX_STACK_SIZE)
            throw new IllegalArgumentException("Invalid stack size: " + numStack);

        // Initialize the frame.
        this.offset = offset;
        this.numLocal = numLocal;
        this.numStack = numStack;

        // Initialize the locals array.
        this.locals = new Object[numLocal];
        for (int i = 0; i < numLocal; ++i)
            this.locals[i] = null;

        // Initialize the stack array.
        this.stack = new Object[numStack];
        for (int i = 0; i < numStack; ++i)
            this.stack[i] = null;

        // Initialize the frame pointer.
        this.framePointer = offset;

        // Initialize the frame size.
        this.frameSize = offset + numLocal * sizeof(Object) + numStack * sizeof(Object);

        // Initialize the frame type.
        this.frameType = FrameType.FUNCTION;

        // Return 3.
        return 3;
    }
}