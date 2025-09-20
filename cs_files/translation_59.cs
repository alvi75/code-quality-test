using System;
using System.Collections.Generic;

public class Translation59
{
    public virtual void UnsetSection(string section, string subsection){
    var configSection = SectionMap.GetSectionByIndex(section - 1);
    if (configSection != null){
        if (SubsectionMap.Get(subsection, -1) != null){
            configSection.Subsections.Remove(subsection);
        }
    }
}
}