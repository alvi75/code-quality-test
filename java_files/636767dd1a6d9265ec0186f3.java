import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
        for (int i=0;i<columns.size();i++){
            if (columns.get(i).getName().equals(oldName)){
                columns.set(i,new NameColumn(newName));
                return;
            }
        }
    }
}