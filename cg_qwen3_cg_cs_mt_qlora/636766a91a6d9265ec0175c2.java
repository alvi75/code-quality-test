import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    /**
 * /**Pop an abstract type from the output frame stack and return its value.
 **/
private int pop(){
        if (tc.isEntryEnabled())
            Tr.entry(tc, "pop", this);
        int result = 0;
        try {
            if (outputFrameStack.size() > 0) {
                AbstractType<?> atype = (AbstractType<?>) outputFrameStack.pop();
                result = atype.getSerializer().deserialize(inputBuffer, inputOffset, inputLength);
                inputOffset += atype.getSerializedSize(result);
                inputLength -= atype.getSerializedSize(result);
            }
        } catch (IOException e) {
            FFDCFilter.processException(e, CLASS_NAME + ".pop", "1", this);
            throw new RuntimeException("Error reading from input buffer.", e);
        }
        if (tc.isEntryEnabled())
            Tr.exit(tc, "pop", Integer.valueOf(result));
        return result;
    }
}