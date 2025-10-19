import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop(){
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        int val = stack.pop();
        if (val == -1) {
            // This is a special case where we have to do some work.
            // We need to find out which of the types was popped, so we can
            // get the name of that type and use it to look up the correct
            // object in the map.
            int index = stack.size() - 1;
            Type t = outputTypes.get(index);
            String s = "type" + Integer.toString(index);
            Object o = map.get(s);
            if (o != null)
                val = ((AbstractType)o).value(t);
            else
                val = ((AbstractType)o).value(t.name());
        }
        return val;
    }
}