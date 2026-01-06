import java.util.*;

public class Translation404 {
    public FileBasedConfig(Config baseConfig, Path cfgLocation, FS fs) {
    super(baseConfig);
    this.cfgLocation = cfgLocation;
    this.fs = fs;
    this.snapshot = FileSnapshot.DIRTY;
    this.hash = ObjectId.zeroId();
}
}