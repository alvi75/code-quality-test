import java.util.*;

public class Generated_636766f81a6d9265ec017758 {
    @Override
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + type.hashCode();
        if(type == Type.STRING){
            hash = 31 * hash + value.hashCode();
        }
        return hash;
    }
}