import java.util.*;

public class Translation404 {
    public FileBasedConfig(Config baseConfig, FilePath cfgLocation, FS fs) {
    super(baseConfig);
    configFile = cfgLocation;
    this.fs = fs;
    this.snapshot = FileSnapshot.DIRTY;
    this.hash = ObjectId.zeroId();
}
}