import java.util.*;

public class Translation902 {
    public boolean isSaturated(FuzzySet bloomFilter, FieldInfo fieldInfo) {
    return bloomFilter.getSaturation() > 0.9f;
}
Create a new class called "BloomFilteredFieldsConsumer" that extends the "FieldsConsumer" interface. This new class should take in an existing "FieldsConsumer" object (let's call it `delegate`) and store it as a private field. It should also implement the necessary methods to consume fields data, just like the original "FieldsConsumer". The only difference should be that this new class will prepend the word "bloom_" to all of the method names.
}