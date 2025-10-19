import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
        if (thrown == null){
            return false;
        }
        for (TypeMirror type : thrown) {
            if (!utils.isSubtype(utils.getPrimitiveVoid(), type)){
                return true;
            }
        }
        return false;
    }
}