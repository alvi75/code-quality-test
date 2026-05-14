import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**Pop an abstract type from the output frame stack and return its value.**/
    private int pop(){
        if (outputFrameStack.size() == 0) {
            throw new RuntimeException("pop called when outputFrameStack is empty");
        }
        AbstractType<?> at = outputFrameStack.pop();
        if (at instanceof Int32Type) {
            return ((Int32Type) at).getValue();
        } else if (at instanceof Int64Type) {
            return ((Int64Type) at).getValue();
        } else if (at instanceof DoubleType) {
            return ((DoubleType) at).getValue();
        } else if (at instanceof BooleanType) {
            return ((BooleanType) at).getValue();
        } else if (at instanceof StringType) {
            return ((StringType) at).getValue().hashCode();
        } else if (at instanceof BytesType) {
            return ((BytesType) at).getValue().hashCode();
        } else {
            throw new RuntimeException("Unknown type: " + at.getClass());
        }
    }
}