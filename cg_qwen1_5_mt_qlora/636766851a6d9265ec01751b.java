import java.util.*;

public class Generated_636766851a6d9265ec01751b {
    /**Convert a hexadecimal number to binary and return its character type.
@see #decodeHexNibble(char)
@param c The hex digit to convert.
@return The character type of the converted nibble, or {@link #CHAR_TYPE_NONE} if it is not a valid hex digit.
*/
private static char decodeHexNibble(final char c) {
        switch (c) {
            case '0':
                return CHAR_TYPE_ZERO;
            case '1':
                return CHAR_TYPE_ONE;
            case '2':
                return CHAR_TYPE_TWO;
            case '3':
                return CHAR_TYPE_THREE;
            case '4':
                return CHAR_TYPE_FOUR;
            case '5':
                return CHAR_TYPE_FIVE;
            case '6':
                return CHAR_TYPE_SIX;
            case '7':
                return CHAR_TYPE_SEVEN;
            case '8':
                return CHAR_TYPE_EIGHT;
            case '9':
                return CHAR_TYPE_NINE;
            case 'a':
            case 'A':
                return CHAR_TYPE_A;
            case 'b':
            case 'B':
                return CHAR_TYPE_B;
            case 'c':
            case 'C':
                return CHAR_TYPE_C;
            case 'd':
            case 'D':
                return CHAR_TYPE_D;
            case 'e':
            case 'E':
                return CHAR_TYPE_E;
            case 'f':
            case 'F':
                return CHAR_TYPE_F;
            default:
                return CHAR_TYPE_NONE;
        }
    }
}