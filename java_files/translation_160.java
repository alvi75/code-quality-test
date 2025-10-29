import java.util.*;

public class Translation160 {
    0;
int exponent = (int)in1.ReadInt();
if (exponent == 0x7fffffff){
    field_2_exponent = 0x7fffffff;
    field_3_fraction = 0;
}
else{
    field_2_exponent = exponent & 0x7f;
    field_3_fraction = (exponent & 0x8000) | in1.ReadInt();
}
}
}