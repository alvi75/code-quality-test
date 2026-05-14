import java.util.*;

public class Generated_6367675c1a6d9265ec01805b {
    public void removeFromTreeEdgeList() {
		if (m_left != null) m_left.removeFromParent();
		if (m_right != null) m_right.removeFromParent();
		m_parent = null;
	}
}