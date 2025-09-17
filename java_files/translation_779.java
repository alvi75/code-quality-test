import java.util.*;

public class Translationtranslation_779 {
    public void addFile(FileHeader fh) {
        checkFileNames(fh.getFileName());
        if (duplicateDetector != null && duplicateDetectorFileNames.contains(fh.getFileName()))throw new DuplicateFormatFlagsException(MessageFormat.format(JGitText.get().fileAlreadyAdded, fh.getFileName()));
        else if (!acceptFile(fh))throw new MissingObjectException(MessageFormat.format(JGitText.get().unsupportedObjectType, Integer.valueOf(fh.getObjectType()), fh.getFileName()));
    }
    addFileInternal(fh);
    }
}