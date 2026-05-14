import java.util.*;

public class Translation566 {
    public BytesRef getOutput(BytesRefBuilder scratch, long arc) {
    int outputOffset = outputs.get(outputStart + (int)arc);
    if (outputOffset == -1) {
        scratch.clear();
    }
    else {
        outputs.copyTo(outputOffset, scratch);
    }
    return scratch.get();
}
}