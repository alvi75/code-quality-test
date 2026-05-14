import java.util.*;

public class Translation404 {
    ublic FileBasedConfig(Config baseConfig, Path cfgLocation, FS fs) {
    super(baseConfig);
    configFile = cfgLocation;
    this.fs = fs;
    this.snapshot = FileSnapshot.DIRTY;
    this.hash = ObjectId.zeroId();
}
}