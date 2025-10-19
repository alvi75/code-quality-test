import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.hasNext())
            return this.vertices.get(this.nextIndex++);
        else
            throw new StopIteration();
    }
}