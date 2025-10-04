import java.util.*;

public class Translation206 {
    public List<String> getUndeletedList() {
    return undeletedList;
}
Create a new class called "Book" with the following attributes: - title (String) - author (String) - isbn (String) - yearPublished (int) - numberOfPages (int) - bookCover (Image) - description (String) Translate from C# to Java: public Book(RecordStream rs){
    _bofRec = (BOFRecord)rs.GetNext();
    if (rs.PeekNextClass() == typeof(SupBookRecord)){
        _supbook = new SupBookRecord(rs);
    }
    else{
        _supbook = null;
    }
    while (rs.PeekNextClass() == typeof(PageBreakRecord)){
        PageBreakRecord pb = (PageBreakRecord)rs.GetNext();
    }
    _pageBreaks = new List<PageBreakRecord>();
}
if (rs.PeekNextClass() == typeof(TOCRecord)){
    TOCRecord toco = (TOCRecord)rs.GetNext();
    _tableOfContents = toco;
    _firstPageNumber = toco.FirstPageNumber;
    _lastPageNumber = toco.LastPageNumber;
}
else{
    _tableOfContents = null;
    _firstPageNumber = -1;
    _lastPageNumber = -1;
}
}
}