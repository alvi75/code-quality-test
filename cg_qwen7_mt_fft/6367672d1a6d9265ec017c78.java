import java.util.*;

public class Generated_6367672d1a6d9265ec017c78 {
    public boolean insert(int val)
    {
        if(root == null){
            root = new MutableNode(val);
            count++;
            return true;
        }
        
        MutableNode n = root;
        while(true){
            int dir = ((Comparable<? super IntWrapper>)n.data).compareTo(new IntWrapper(val));
            
            if(dir < 0){
                // go left
                if(n.left != null){
                    n = n.left;
                    continue;
                }else{
                    n.left = new MutableNode(val);
                    break;
                }
            }else if(dir > 0){
                //go right
                if(n.right != null){
                    n = n.right;
                    continue;
                }else{
                    n.right = new MutableNode(val);
                    break;
                }
            }else{
                //duplicates not allowed
                return false;
            }
            count++;
        }
        
        fix();
        
        return true;
    }
}