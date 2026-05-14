import java.util.*;

public class Generated_636767821a6d9265ec0183a0 {
    /**Delete the given file if it exists**/
    protected static void deleteFile(String fileName){
        File f = new File(fileName);
        if(f.exists()){
            f.delete();
        }
    }
}