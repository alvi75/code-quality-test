import java.util.*;

public class Translationtranslation_116 {
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        AutomatonQuery other = (AutomatonQuery) obj;
        if (!compiled.equals(other.compiled)) return false;
        if (term != null ? !term.equals(other.term) : other.term != null) return false;
        return true;
    }
}