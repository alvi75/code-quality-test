import java.util.*;

public class Generated_636767501a6d9265ec017e86 {
    @Override
    public ListNode<E> previousNode(){
        if( this == head )
            return null;
        
        /**Returns the previous ListNode.**/ 
        int index = list.indexOf(this);
        if(index > 0)
            return list.get(index-1);
        else
            return null;
    }
}