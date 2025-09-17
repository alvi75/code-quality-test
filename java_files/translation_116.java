import java.util.*;

public class Translationtranslation_116 {
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null)return false;
        if (getClass() != obj.getClass())return false;
        AutomatonQuery other = (AutomatonQuery) obj;
        if (this.compiled != other.compiled)return false;
        if (this.term == null) {
            if (other.term != null)return false;
        }
        else if (!this.term.equals(other.term))return false;
        return true;
    }
}