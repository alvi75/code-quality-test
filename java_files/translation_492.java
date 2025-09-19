import java.util.*;

public class Translation492 {
    public FSTTermsWriter(SegmentWriteState state, PostingsWriterBase postingsWriter) {
    final String termsFileName = IndexFileNames.segmentFileName(state.segmentInfo.name, state.segmentSuffix, TERMS_EXTENSION);
    this.postingsWriter = postingsWriter;
    this.fieldInfos = state.fieldInfos;
    this.out = state.directory.createOutput(termsFileName, state.context);
    boolean success = false;
    try {
        CodecUtil.writeIndexHeader(out, CODEC_NAME, VERSION_CURRENT, state.segmentInfo.getId(), state.segmentSuffix);
        currentField = null;
        indexInterval = DEFAULT_INDEX_INTERVAL;
        success = true;
    }
    finally {
        if (success) {
            return;
        }
        else {
            IOUtils.closeWhileHandlingException(out);
        }
    }
}
public FSTTermsWriter(SegmentWriteState state, PostingsWriterBase postingsWriter) throws IOException {
    final String termsFileName = IndexFileNames.segmentFileName(state.segmentInfo.name, state.segmentSuffix, TERMS_EXTENSION);
    this.postingsWriter = postingsWriter;
    this.fieldInfos = state.fieldInfos;
    this.out = state.directory.createOutput(termsFileName, state.context);
    boolean success = false;
    try {
        CodecUtil.writeIndexHeader(out, CODEC_NAME, VERSION_CURRENT, state.segmentInfo.getId(), state.segmentSuffix);
        currentField = null;
        indexInterval = DEFAULT_INDEX_INTERVAL;
        success = true;
    }
    finally {
        if (success) {
            return;
        }
        else {
            IOUtils.closeWhileHandlingException(out);
        }
    }
}
}