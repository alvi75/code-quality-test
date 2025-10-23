import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        if(descriptor.charAt(0) == 'I'){
            popInt();
        }else if(descriptor.charAt(0) == 'F'){
            popFloat();
        }else if(descriptor.charAt(0) == 'D'){
            popDouble();
        }else if(descriptor.charAt(0) == 'J'){
            popLong();
        }else if(descriptor.charAt(0) == 'B' || descriptor.charAt(0) == 'C'){
            popByte();
        }else if(descriptor.charAt(0) == 'S'){
            popShort();
        }else if(descriptor.charAt(0) == 'Z'){
            popBoolean();
        }else if(descriptor.charAt(0) == 'L'){
            popObject();
        }else if(descriptor.charAt(0) == '['){
            popArray();
        }
    }
}