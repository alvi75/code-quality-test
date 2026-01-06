import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    public int visitFrameStart(final int offset,final int numLocal,final int numStack){
		if (stack.getStackDepth()>0) {
			throw new RuntimeException("Stack is not empty when visiting frame");
		}
		stack.setStackOffset(offset);
		stack.setNumLocals(numLocal);
		stack.setNumStacks(numStack);
		stack.setFrameType(FRAME_NORMAL);
		return 3;
	}
}