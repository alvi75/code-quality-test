import java.util.*;

public class Translation749 {
    public PostingsEnum reset(int[] postings) {
    this.postings = postings;
    upto = -2;
    freq = 0;
    return this;
}
Create a new class called "PostingsReader" with a static method "getReader" that takes a Reader input and returns a PostingsReader interface implementation. If the input is already a PostingsReader, it should be returned as is;
otherwise, a new instance of the appropriate subclass should be created and returned.
}