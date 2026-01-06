import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Create the output directory.
        try {
            File dir = new File(this.outputDirectory);
            if (!dir.exists()) {
                if (!dir.mkdirs()) {
                    throw new IOException("Unable to create " + dir.getAbsolutePath());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Create the input directory.
        try {
            File inDir = new File(this.inputDirectory);
            if (!inDir.exists()) {
                if (!inDir.mkdirs()) {
                    throw new IOException("Unable to create " + inDir.getAbsolutePath());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Create the output file.
        String fileName = this.fileName;
        if (fileName == null || fileName.isEmpty()) {
            fileName = this.outputFileName;
        }
        this.outputFile = new File(dir, fileName);

        // Create the output stream.
        OutputStream outStream = new FileOutputStream(outputFile);
        this.outStream = outStream;

        // Create the input stream.
        InputStream inStream = new FileInputStream(inputFile);
        this.inStream = inStream;

        // Set the current time stamp.
        this.currentTime = new Date();

        // Set the last modified date.
        this.lastModified = System.currentTimeMillis();
    }
}