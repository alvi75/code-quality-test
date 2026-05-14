import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,
                          final StringBuffer buf){
        if(nameStart<0||nameStart>=this.name.length()){
            throw new IllegalArgumentException("Invalid name start index "+nameStart);
        }
        for(int i=nameStart;i<this.name.length();i++){
            char c=this.name.charAt(i);
            if(c=='.'){
                buf.append('.');
            }else{
                buf.append(Character.toUpperCase(c));
            }
        }
    }
}