import java.util.*;

public class Generated_636766fe1a6d9265ec017821 {
    /**Append a byte array to a buffer.**/
    protected void appendDetail(StringBuffer buffer,String fieldName,byte[] array)
    {
        if (array != null)
        {
            buffer.append(" ");
            buffer.append(fieldName);
            buffer.append(" [");
            for (int i=0;i<array.length;i++)
            {
                buffer.append(Integer.toHexString(array[i]&0xff));
                buffer.append(" ");
            }
            buffer.append("]");
        }
    }
}