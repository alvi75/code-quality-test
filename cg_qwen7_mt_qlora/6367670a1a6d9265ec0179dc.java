import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    /**Add the elements indexed from start to end in currentFrame to Frame.*/
private void putAbstractTypes(final int start,final int end){
		for(int i=start;i<end;++i){
			final AbstractType<?> type = currentFrame.get(i);
			if(type != null) {
				frame.put(i,type);
			}
		}
	}
}