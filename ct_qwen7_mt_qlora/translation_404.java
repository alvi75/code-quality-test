import java.util.*;

public class Translation404 {
    1 public FileBasedConfig(Config baseConfig, Path configFilePath, FileSystem fileSystem) {
    2 super(baseConfig);
    3 this.configFile = configFilePath;
    4 this.fileSystem = fileSystem;
    5 this.snapshot = FileSnapshot.DIRTY;
    6 this.hash = ObjectId.zeroId();
    7 }
}