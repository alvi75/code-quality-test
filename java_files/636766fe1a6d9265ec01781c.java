import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    /**Return the Character object converted from the given character.**/
    public static Character toCharacterObject(final char ch){
        if (ch >= 0 && ch <= 0xFFFF) {
            return new Character(ch);
        }
        else if (ch >= 0xDC0 && ch <= 0xDFFF) {
            return new Character((char) ((ch - 0x10FFFF) + 0x10000));
        }
        else if (ch >= 0xE000 && ch <= 0xF0FF) {
            return new Character(((ch - 0x2F800) + 0x40000) / 65536);
        }
        else if (ch >= 0x2F80 && ch <= 0x2FEF) {
            return new Character(((ch - 0x10000) + 0x400) / 65536);
        }
        else if (ch >= 0x1000 && ch <= 0x19F) {
            return new Character(((ch - 0x01000) + 0x400) / 65536);
        }
        else if (ch >= 0x10000 && ch <= 0x19F) {
            return new Character(((ch - 0x10000) + 0x400) / 65536);
        }
        else if (ch >= 0x20000 && ch <= 0x2FF) {
            return new Character(((ch - 0x10000) + 0x400) / 65536);
        }
        else if (ch >= 0x30000 && ch <= 0x3FF) {
            return new Character(((ch - 0x10000) + 0x400) / 65536);
        }
        else if (ch >= 0x40000 && ch <= 0x7FFF) {
            return new Character(((ch - 0x10000) + 0x400) / 65536);
        }
        else if (ch >= 0xA00
}