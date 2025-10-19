import java.util.*;

public class Generated_6367672d1a6d9265ec017c78 {
    public boolean insert(int val){
        if(size == data.length){
            int temp[] = new int[2*size];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
        
        for(int i=0; i<size; i++){
            if(data[i] == val){
                return false;
            }
        }
        
        data[size++] = val;
        return true;
    }
}