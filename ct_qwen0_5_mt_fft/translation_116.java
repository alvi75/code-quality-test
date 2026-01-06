import java.util.*;

public class Translation116 {
    public boolean equals(Object obj) {
    if ( this == obj ) return true;
    if ( ! super . equals ( obj ) ) return false;
    if ( getClass ( ) != obj . getClass ( ) ) return false;
    AutomatonQuery other = (AutomatonQuery ) obj;
    if ( ! m_compiled . equals ( other . m_compiled ) ) return false;
    if ( m_term == null ? other . m_term != null : ! m_term . equals ( other . m_term ) ) return false;
    return true;
}
}