import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        while(!stack.isEmpty()){
            if(hasNextLocal()) {
                return true;
            } else {
                stack.pop();
            }
        }
        return false;
    }
}