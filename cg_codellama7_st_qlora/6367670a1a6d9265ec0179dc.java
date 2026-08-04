import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start,final int end){
        for(int i=start;i<end;i++){
            final int type = getType(i);
            if(type==0){
                continue;
            }
            final int index = getIndex(i);
            final int frameIndex = getFrameIndex(i);
            final int frameType = getFrameType(i);
            if(frameType==0){
                continue;
            }
            if(frameType==1){
                frame.put(index,type);
            }else if(frameType==2){
                frame.put(index,type,frame.get(index));
            }else if(frameType==3){
                frame.put(index,type,frame.get(index),frame.get(index));
            }else if(frameType==4){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index));
            }else if(frameType==5){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index),frame.get(index));
            }else if(frameType==6){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index));
            }else if(frameType==7){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index));
            }else if(frameType==8){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index));
            }else if(frameType==9){
                frame.put(index,type,frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index),frame.get(index));
}