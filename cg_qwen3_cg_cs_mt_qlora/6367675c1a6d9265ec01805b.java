import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
        if (this.parent != null){
            this.parent.remove(this);
        }
        if (this.child != null){
            this.child.remove(this);
        }
    }
}