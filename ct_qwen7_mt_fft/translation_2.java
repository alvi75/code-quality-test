import java.util.*;

public class Translation2 {
    public void writeByte(int v) {
    try {
        int numBlocksWritten = _writeStream.writeByte(v);
        _currentBlockSize += numBlocksWritten;
        if (_currentBlockSize > _blockSize && _nextBlock != null) {
            _flushCurrentBlock();
        }
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}