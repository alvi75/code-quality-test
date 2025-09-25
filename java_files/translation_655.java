import java.util.*;

public class Translation655 {
    public static final TermStats[] getHighFreqTerms( IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    final List<LazyField> list = new ArrayList<>();
    final FieldInfos infos = DirectoryReader.openDirectory(reader).getFieldInfos();
    final Set<String> ignoreFields = Arrays.asList(FieldNames.TYPE_NAME, FieldNames.SUMMARY_NAME);
    for (final FieldInfo info : infos) {
        if (!ignoreFields.contains(info.name)) {
            list.add(new LazyField() {
                private final FieldInfo finfo = info;
}