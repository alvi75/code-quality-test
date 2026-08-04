import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
		if(dataset.getNumRows() != this.getNumRows()){
			return false;
		}
		for(int i = 0; i < this.getNumRows(); i++){
			if(!this.get(i).equals(dataset.get(i))){
				return false;
			}
		}
		return true;
	}
}