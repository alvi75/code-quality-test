import java.util.*;

public class Generated_636767e01a6d9265ec018755 {
    public virtual void BuildContent(JsonObject jsonObject){var content = new Dictionary<string, object>();foreach (var entry in jsonObject){var key = entry.Key;var value = entry.Value;if (value is JsonObject){content[key] = BuildContent((JsonObject)value);}else if (value is JsonArray){content[key] = BuildContent((JsonArray)value);}else{content[key] = value;}}return content;}
}