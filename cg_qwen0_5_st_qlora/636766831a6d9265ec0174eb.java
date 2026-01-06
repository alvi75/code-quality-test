import java.util.*;

public class Generated_636766831a6d9265ec0174eb {
    private void addReverse(final File[] files){
        for(int i = 0; i < files.length; i++){
            if(files[i] != null && !files[i].isDirectory()){
                files[i] = new File(files[i].getAbsolutePath());
            }
        }
        Collections.reverse(Arrays.asList(files));
    }
}