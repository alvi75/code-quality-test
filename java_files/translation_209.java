import java.util.*;

public class Translation209 {
    1;
string line;
while ((line = @in.ReadLine()) != null){
    string[] parts = new Regex("\\t").Append(line).TrimEnd();
    word = parts[0];
    synonym = (parts.Length > 1) ? parts[1] : null;
    if (!word.Equals(lastWord, StringComparison.Ordinal)){
        Add(word, synonym);
        word = lastWord;
    }
    if (synonym == null){
        synonym = "";
    }
    synonyms.Add(new Synonym(word, synonym));
}
}
}