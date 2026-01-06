import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList(){
		if (m_next != null){
			m_next.m_prev = m_prev;
		}
		if (m_prev != null){
			m_prev.m_next = m_next;
		}
	}
}