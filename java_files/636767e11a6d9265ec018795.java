import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public boolean isCompatible(DataTable dataset){
        if (this.buckets.size() != dataset.buckets.size()){
            return false;
        }
        for (int i = 0; i < this.buckets.size(); i++){
            if (!this.buckets.get(i).equals(dataset.buckets.get(i))){
                return false;
            }
        }
        return true;
    }
}