import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    /**Return the path without the extension.
@since 1.0
@param path The path to strip the extension from.
@return The path with no extension.
*/
public static String stripFilenameExtension(String path){
String ext = getFilenameExtension(path);
if(ext == null) return path;
return path.substring(0, path.length() - ext.length());
}
}