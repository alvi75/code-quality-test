import java.util.*;

public class Generated_636767a31a6d9265ec01854f {
    /**
 * Check if the field should be packed,if so,read the field and update the internal state. It will throw an exception when the process of reading is wrong.
 */
    private void checkIfPackedField() throws IOException {
        if (packedFields == null) {
            return;
        }
        int index = 0;
        while (index < packedFields.length && !isPacked(packedFields[index])) {
            index++;
        }

        if (index >= packedFields.length) {
            //no more packed fields to read
            return;
        }

        //we have a packed field to read
        int packedFieldIndex = packedFields[index];
        int packedFieldLength = packedFieldLengths[packedFieldIndex];

        //check that we can read the whole field
        if (currentPosition + packedFieldLength > data.length) {
            throw new IOException("Cannot read packed field " + packedFieldIndex);
        }

        //read the field
        switch (packedFieldIndex) {
            case PackedField.PACKED_FIELD_INT:
                currentIntValue = ByteUtils.readInt(data, currentPosition);
                break;

            case PackedField.PACKED_FIELD_LONG:
                currentLongValue = ByteUtils.readLong(data, currentPosition);
                break;

            default:
                throw new IOException("Unknown packed field: " + packedFieldIndex);
        }

        //update the position
        currentPosition += packedFieldLength;

        //update the internal state
        packedFieldsState[index] = true;
    }
}