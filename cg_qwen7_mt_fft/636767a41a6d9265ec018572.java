import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64()
        throws IOException {
        byte b = buffer.getByte(position);
        int value;
        if (b >= 0) {
            return b;
        }
        else {
            value = b & 0x7f;
            if ((b = buffer.getByte(++position)) >= 0) {
                value |= b << 7;
            } else {
                value |= (b & 0x7f) << 7;
                if ((b = buffer.getByte(++position)) >= 0) {
                    value |= b << 14;
                } else {
                    value |= (b & 0x7f) << 14;
                    if ((b = buffer.getByte(++position)) >= 0) {
                        value |= b << 21;
                    } else {
                        value |= (b & 0x7f) << 21;
                        if ((b = buffer.getByte(++position)) >= 0) {
                            value |= b << 28;
                        } else {
                            value |= (b & 0x7f) << 28;
                            if ((b = buffer.getByte(++position)) >= 0) {
                                value |= b << 35;
                            } else {
                                value |= (b & 0x7f) << 35;
                                if ((b = buffer.getByte(++position)) >= 0) {
                                    value |= b << 42;
                                } else {
                                    value |= (b & 0x7f) << 42;
                                    if ((b = buffer.getByte(++position)) >= 0) {
                                        value |= b << 49;
                                    } else {
                                        value |= (b & 0x7f) << 49;
                                        if ((b = buffer.getByte(++position)) >= 0) {
                                            value |= b << 56;
                                        } else {
                                            throw new ProtobufException("Malformed varint.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Discard upper bits.
            return value & 0x7fffffffffffffffL;
        }
    }
}