import java.util.*;

public class Generated_636766fa1a6d9265ec0177a9 {
    private void addInitializedType(final int abstractType){
        if (abstractType == 0) {
            mAbstractTypes.add(abstractType);
        } else {
            for(int i = 0; i < mAbstractTypes.size(); ++i){
                if(mAbstractTypes.get(i) == abstractType){
                    return;
                }
            }
            mAbstractTypes.add(abstractType);
        }
    }
}