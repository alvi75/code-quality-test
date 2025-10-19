import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        if(!hasNext()){
            for(int i = 0; i < numVertices; i++){
                if(!visited[i])
                    return true;
            }
        }
        return false;
    }
}