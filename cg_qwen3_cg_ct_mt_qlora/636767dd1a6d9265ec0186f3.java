import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
		for(int i=0;i<column.size();i++){
			if(column.get(i).getName().equals(oldName)){
				column.get(i).setName(newName);
			}
		}
	}
}