import java.util.*;

public class Generated_636767e11a6d9265ec018795 {
    public bool IsCompatible(DataTable dataset) {return _buckets.Count == dataset.Buckets.Count && _buckets.All(b => dataset.Buckets.Any(d => d.Equals(b)));}
}