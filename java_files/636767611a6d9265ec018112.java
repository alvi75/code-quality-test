import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.vertexIterator.hasNext()) {
            return this.vertexIterator.next();
        } else {
            throw new NoSuchElementException("No more vertex to iterate over");
        }
    }
}