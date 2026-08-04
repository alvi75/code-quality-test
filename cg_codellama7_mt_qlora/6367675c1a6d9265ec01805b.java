import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList() {
        if (this.left != null) {
            this.left.right = this.right;
        }
        if (this.right != null) {
            this.right.left = this.left;
        }
        this.left = null;
        this.right = null;
    }
}