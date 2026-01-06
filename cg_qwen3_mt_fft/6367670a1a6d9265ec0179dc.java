import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start,final int end){
        for(int i=start;i<end;++i){
            final Type t = this.currentFrame.get(i);
            if(t instanceof AbstractType){
                this.put((AbstractType)t);
            }
        }
    }
}