import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
		if (this.getRows() != dataset.getRows()){
			return false;
		}
		for (int i = 0; i < this.getRows(); i++){
			if (!this.getRow(i).equals(dataset.getRow(i))){
				return false;
			}
		}
		return true;
	}
}