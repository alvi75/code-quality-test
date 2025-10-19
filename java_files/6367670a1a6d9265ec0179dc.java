import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start,final int end){
        for(int i = start; i < end; i++){
            final AbstractType type = (AbstractType) frame.get(i);
            if(type instanceof AbstractType){
                final AbstractType abstractType = (AbstractType) type;
                if(abstractType.isAbstract()){
                    frame.put(i, abstractType);
                }
            }
        }
    }
}