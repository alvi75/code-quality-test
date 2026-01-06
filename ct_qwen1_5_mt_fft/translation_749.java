import java.util.*;

public class Translation749 {
    public final DocsEnum reset(int[] postings) {
    assert postings != null && postings.length > 0;
    this.postings = postings;
    upto = -2;
    freq = 0;
    return this;
}
}