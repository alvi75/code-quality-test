import java.util.*;

public class Translation116 {
    @Override public boolean equals(Object obj) {
    if ( this == obj ) return true;
    if ( !super.equals( obj ) ) return false;
    if ( getClass() != obj.getClass() ) return false;
    AutomatonQuery other = (AutomatonQuery) obj;
    if ( m_compiled != other.m_compiled ) return false;
    return true;
}
}