import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
		for (int i = 0; i < this.column.length; i++) {
			if(this.column[i].name.equals(oldName)){
				this.column[i].name=newName;
			}
		}
	}
}