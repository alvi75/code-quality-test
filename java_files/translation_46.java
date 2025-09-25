import java.util.*;

public class Translation46 {
    1024) {
    return false;
}
if (mInput == null) {
    throw new IllegalStateException("No input stream");
}
try {
    int n = mInput.read(buffer);
    if (n < 0) {
        return false;
    }
    mOutput.write(buffer, 0, n);
    return true;
}
catch (IOException e) {
    setError();
    return false;
}
}
}