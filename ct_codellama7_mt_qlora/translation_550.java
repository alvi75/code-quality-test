import java.util.*;

public class Translation550 {
    public String toString() {
    return "spans(" + m_term.toString() + ")@" + (m_doc == -1 ? "START" : (m_doc == Integer.MAX_VALUE) ? "END" : m_doc + "-" + m_position);
}
}