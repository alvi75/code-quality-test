import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    /**
 * Change the elements whose values are oldName to newName in column
 **/
    public void overrideName(String oldName,String newName){
        for(int i=0;i<elements.size();i++){
            if(elements.get(i).equals(oldName)){
                elements.set(i,newName);
            }
        }
    }
}