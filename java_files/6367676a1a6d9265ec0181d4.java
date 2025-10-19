import java.util.*;

public class Generated_6367676a1a6d9265ec0181d4 {
    public static String[] addStringToArray(String[] array,String str){
		if(array==null)
			array=new String[1];
		else if(array.length==0)
			array=new String[1];
		else{
			String[] temp=array;
			array=new String[array.length+1];
			for(int i=0;i<array.length;i++)
				array[i]=temp[i];
		}
		array[array.length-1]=str;
		return array;
	}
}