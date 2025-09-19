import java.util.*;

public class Translation116 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (obj == null)return false;
    if (getClass() != obj.getClass())return false;
    AutomatonQuery other = (AutomatonQuery) obj;
    if (this.getCompiledAutomations() == null ^ other.getCompiledAutomations() == null)return false;
    if (this.minimumNumberShouldMatch != other.minimumNumberShouldMatch)return false;
    if (this.getField() == null ? !other.getField().equals(this.getField()) : false)return false;
    if (this.getOperator(BoostFieldQueryNode.class) == null ^ other.getBoostFieldQueryNode() == null)return false;
    return this.boost==other.boost && this.field.equals(other.field);
}
}