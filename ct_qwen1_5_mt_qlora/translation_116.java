import java.util.*;

public class Translation116 {
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    AutomatonQuery other = (AutomatonQuery) obj;
    if (!m_compiled.equals(other.m_compiled)) return false;
    if (m_term == null) {
        if (other.m_term != null) return false;
    }
    else if (!m_term.equals(other.m_term)) return false;
    return true;
}
}