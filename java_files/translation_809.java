import java.util.*;

public class Translation809 {
    public Set<BitSet> getAltsTransitions() {
    BitSet set = new BitSet();
    for (ATNConfig c : configs) {
        if ( c.state.getEdge(0)!=null ) {
            set.add(c.state.getEdge(0).label);
        }
    }
    c = c.next;
}
return Collections.unmodifiableSet(set);
}
}