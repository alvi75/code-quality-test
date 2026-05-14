import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path, String relativePath) {
        if (path == null || relativePath == null)
            return null;
        // If no separator character is found in the relative path then just add it to the end of the base path.
        if (-1 == relativePath.indexOf(File.separatorChar)) {
            return PathNormalizer.joinPaths(path, relativePath);
        }
        List<String> base = splitIntoPathTokens(path);
        List<String> relative = splitIntoPathTokens(relativePath);

        int i;
        for (i = 0; i < Math.min(base.size(), relative.size()); i++) {
            if (!base.get(i).equals(relative.get(i)))
                break;
        }

        StringBuilder newPath = new StringBuilder();
        for (int j = i; j < base.size(); j++)
            newPath.append(PathNormalizer.PATH_SEP).append(base.get(j));
        for (int k = i; k < relative.size(); k++)
            newPath.append(PathNormalizer.PATH_SEP).append(relative.get(k));

        return newPath.toString();
    }
}