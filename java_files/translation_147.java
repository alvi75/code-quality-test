import java.util.*;

public class Translation147 {
    public SynonymFilterSynonymFilter synonyms = new JCG.Dictionary<string, IList<Synonym>>(23);
#pragma warning disable 612, 618foreach (string line in lines){
    if (line.Length == 0){
        continue;
    }
    string[] parts = line.Split(new string[] {
        "," }
        , StringSplitOptions.RemoveEmptyEntries);
        string firstPart = parts[0];
        bool isInnerContext = false;
        if (firstPart.IndexOf(':') < 0){
            synonyms[firstPart] = new List<Synonym>();
        }
        else{
            isInnerContext = true;
            string key = firstPart.Substring(0, firstPart.IndexOf(':');
            string value = firstPart.Substring(firstPart.IndexOf(':') + 1);
            synonyms[key] = ParseSynonyms(value, isInnerContext);
        }
    }
}
}