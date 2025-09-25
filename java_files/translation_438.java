import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    return super.ramBytesUsed()+ postingsReader.ramBytesUsed();
}
}