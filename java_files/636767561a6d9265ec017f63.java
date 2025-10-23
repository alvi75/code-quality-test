import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        while (true){
            if (currentVertex == null) {
                currentVertex = nextVertex();
                if (currentVertex != null)
                    break;
            }
            else{
                if (currentVertex.hasNext())
                    break;
                else{
                    currentVertex = nextVertex();
                    if (currentVertex != null)
                        break;
                }
            }
        }
        return true;
    }
}