import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        while(!stack.isEmpty()){
            int v = stack.peek();
            if(!visited[v]){
                return true;
            }
            stack.pop();
        }
        return false;
    }
}