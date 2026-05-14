import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        if (this.hasNextVertex()){
            return true;
        }
        else{
            while(this.hasNextEdge()){
                this.next();
            }
            return false;
        }
    }
}