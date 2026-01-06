import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop(){
        int v = _stack.pop();
        if (v == 0) {
            throw new IllegalStateException("no frame on stack");
        }
        if (_stack.isEmpty()) {
            _frameType = -1;
        } else {
            _frameType = _stack.peek();
        }
        return v;
    }
}