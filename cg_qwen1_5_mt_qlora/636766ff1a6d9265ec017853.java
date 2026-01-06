import java.util.*;

public class Generated_636766ff1a6d9265ec017853 {
    /**Return the label by the given bytecode offset if it has been created. Otherwise, creat a new label and return it.
    @param bytecodeOffset The bytecode offset of the label to be returned.
    @param labels An array containing all the labels that have been created so far.
    @return The label at the given bytecode offset or a newly created one.
    */
  protected Label readLabel(final int bytecodeOffset,final Label[] labels){
    for(int i=0;i<labels.length;++i)
      if(labels[i].getBytecodeOffset()==bytecodeOffset)return labels[i];
    final Label label=new Label(bytecodeOffset);
    labels[labels.length]=label;
    return label;
  }
}