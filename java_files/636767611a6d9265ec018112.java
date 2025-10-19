import java.util.*;

public class Generated_636767611a6d9265ec018112 {
    /**Get next vertext from a graph.*/
    @Override
    protected V provideNextVertex(){
        if (m_graph == null) {
            return null;
        }
        int v = m_graph.nextVertex();
        if (v < 0) {
            return null;
        }
        return m_graph.getVertex(v);
    }
}