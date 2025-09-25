import java.util.*;

public class Translation867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
    assert _isReadOnly == false;
    assert _hasArray == true;
    assert _array != null;
    assert _offset >= 0 && _offset < _array.length;
    assert _limit >= 0 && _limit <= _array.length;
    assert _position >= 0 && _position <= _limit;
    assert srcOffset >= 0 && srcOffset < src.Length;
    assert shortCount >= 0 && shortCount <= src.Length - srcOffset;
    _limit = Math.Min(_limit, _offset + _remaining);
    int byteCount = shortCount * SizeOf.SHORT;
    if (_order == ByteOrder.LITTLE_ENDIAN) {
        for (int i = 0;
        i < byteCount;
        ++i) {
            _array[_offset + _position++] = unchecked((short)(((ulong)_array[srcOffset + i] << 8) | ((ulong)_array[srcOffset + i] >> 8)));
        }
    }
    else {
        for (int i = 0;
        i < byteCount;
        ++i) {
            _array[_offset + _position++] = unchecked((short)((uint)_array[srcOffset + i] << 24) | ((uint)_array[srcOffset + i] << 16) | ((uint)_array[srcOffset + i] << 8) | ((uint)_array[srcOffset + i] >>> 8)));
        }
    }
    _remaining -= shortCount;
    return this;
}
}