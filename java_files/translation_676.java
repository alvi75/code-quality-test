import java.util.*;

public class Translation676 {
    0;
int i = 0;
for (i = 0;
i < shapes.Count;
i++){
    HSSFShape shp = (HSSFShape)shapes[i];
    if (shp == shape){
        break;
    }
}
if (i >= shapes.Count){
    throw new InvalidOperationException("Unable to add shape");
}
else{
    shapes.Insert(i + 1, shape);
}
}
}