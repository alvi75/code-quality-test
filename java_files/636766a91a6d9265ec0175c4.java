import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.**/
    switch (descriptor.charAt(0)) {
      case 'B':
        popByte();
        break;
      case 'C':
        popChar();
        break;
      case 'D':
        popDouble();
        break;
      case 'F':
        popFloat();
        break;
      case 'I':
        popInt();
        break;
      case 'J':
        popLong();
        break;
      case 'S':
        popShort();
        break;
      case 'Z':
        popBoolean();
        break;
      case 'V':
        popVoid();
        break;
      case 'L':
        popClass();
        break;
      default:
        throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
    }
  }
}