import java.util.*;

public class Translation404 {
    ublic FileBasedConfig(Config baseConfig, File cfgLocation, FS fs) {
    super(baseConfig);
    configFile = cfgLocation;
    this.fs = fs;
    snapshot = FileSnapshot.DIRTY;
    hash = null;
}
}