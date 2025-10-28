import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init() {
        if (mInitialized) return;
        mInitialized = true;

        // Create the file system.
        try {
            mFileSystem = new FileSystem();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Initialize the root node.
        mRootNode = new DirectoryNode(mFileSystem, "/");
    }
}