import java.util.*;

public class Translationtranslation_404 {
    public FileBasedConfig(Config base, File cfgLocation, FS fs) {
        super(base);
        configFile = cfgLocation;
        this.fs = fs;
        this.snapshot = FileSnapshot.DIRTY;
        this.hash = null;
    }
}