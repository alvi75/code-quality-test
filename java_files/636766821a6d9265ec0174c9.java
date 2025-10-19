import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
        String[] paths = System.getProperty("java.class.path").split(File.pathSeparator);
        List<File> files = new ArrayList<>();
        for (String path : paths){
            if(path.contains(".jar") || path.contains(".zip")){
                try{
                    JarFile jarFile = new JarFile(new File(path));
                    Enumeration<JarEntry> entries = jarFile.entries();
                    while(entries.hasMoreElements()){
                        files.add(new File(jarFile.getName() + "/" + entries.nextElement().getName()));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        return files.toArray(new File[files.size()]);
    }
}