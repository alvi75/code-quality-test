import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.**/
    int result = 0;
    if (frameStack.isEmpty()) {
      throw new IllegalStateException("No more frames to pop");
    }
    Frame f = frameStack.pop();
    try {
      switch (f.type) {
        case Frame.STRING:
          result = ((StringFrame)f).value;
          break;
        case Frame.INTEGER:
          result = ((IntegerFrame)f).value;
          break;
        case Frame.FLOATING_POINT:
          result = ((FloatingPointFrame)f).value;
          break;
        default:
          throw new IllegalStateException("Unknown frame type: " + f.type);
      }
    } finally {
      f.close();
    }
    return result;
  }
}