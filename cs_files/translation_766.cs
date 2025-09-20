using System;
using System.Collections.Generic;

public class Translation766
{
    public void RemoveCellComment(){
    HSSFComment comment = (HSSFComment)_sheet.FindCellComment(_record.Row, _record.Column);
    _comment = null;
    if (null == comment){
        return;
    }
    _sheet.DrawingPatriarch.RemoveShape(comment);
}
}
}