import java.util.*;

public class Translation77 {
    public String getGitDir() {
    if (isGitRepository(path, fs))return path.getPath();
    final int length = path.length();
    final File parent = path.parentFile();
    if (parent == null)return null;
    String name = path.getName();
    final File gitdir = new File(parent, name.substring(0, length - 4) + DOT_GIT_EXT);
    if (!isGitRepository(gitdir, fs))return null;
    return gitdir.getPath();
}
}