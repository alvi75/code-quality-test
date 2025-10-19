import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start,final int end){
        for(int i=start;i<end;i++){
            if(abstractTypes[i]==null) continue;
            final String name=abstractTypes[i].getName();
            if(name==null) continue;
            //System.out.println("Adding "+name+" to "+Frame.class);
            try{
                frame.put(name,abstractTypes[i]);
            }catch(Exception e){
                System.err.println("Error putting "+name+" to "+frame.getClass().getName());
                e.printStackTrace(System.err);
            }
        }
    }
}