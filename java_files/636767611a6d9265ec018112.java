import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    @Override
    protected V provideNextVertex(){
        if (this.vertices.isEmpty()){
            return null;
        }
        
        int index = this.vertices.size() - 1;
        V vertex = this.vertices.get(index);
        this.vertices.remove(index);
        return vertex;
    }
}