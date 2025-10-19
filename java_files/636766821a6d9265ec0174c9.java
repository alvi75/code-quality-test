import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
        String path = System.getProperty("java.class.path");
        File[] files = new File(path).listFiles();
        if(files==null){
            return null;
        }
        List<File> fileList = Arrays.asList(files);
        Collections.sort(fileList, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return fileList.toArray(new File[fileList.size()]);
    }
}