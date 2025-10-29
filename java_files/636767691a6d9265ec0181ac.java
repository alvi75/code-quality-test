import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path, String relativePath) {if (relativePath == null || relativePath.length() == 0)return path;int index = path.lastIndexOf(FOLDER_SEPARATOR);if (index < 0)return path + relativePath;if (index > 0 && !path.endsWith(FOLDER_SEPARATOR))return path + File.separator + relativePath;else return path + relativePath;}
}