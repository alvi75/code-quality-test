using System;
using System.Collections.Generic;

public class Translation830
{
    public EscherGraphics(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, IColor forecolor, float verticalPointsPerPixel){
    this.m_escherGroup = escherGroup;
    this.m_workbook = workbook;
    this.m_verticalPointsPerPixel = verticalPointsPerPixel;
    this.m_font = new Font("Arial", 0, 10);
    this.m_foreground = forecolor;
}
}