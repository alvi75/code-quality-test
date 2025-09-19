import java.util.*;

public class Translation629 {
    public Entry getEntry(final String name) throws FileNotFoundException {
    if (excludes.contains(name))throw new FileNotFoundException(name);
    final Entry<?> entry = directory.getEntry(name);
    if (entry instanceof FileEntry)return (FileEntry) entry;
    final ZipEntry zipEntry = (ZipEntry) entry;
    if (zipEntry.isDirectory() && !excludeDirNoGitLinks)|| (!(zipEntry.isFile() || isGitLink(zipEntry)))return entry;
    throw new FileNotFoundException(name);
}
}