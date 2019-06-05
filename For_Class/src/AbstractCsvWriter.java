import java.io.FileWriter;
import java.io.IOException;

/**
 * Abstract class of CSV File Writer
 */
public abstract class AbstractCsvWriter {
    /**
     * File writer to write a csv file.
     */
    protected FileWriter fout;

    /**
     * Initialize file writer with the file path.
     *
     * @param filePath - File path to write
     * @throws IOException
     */
    public AbstractCsvWriter(String filePath) throws IOException {
        fout = new FileWriter(filePath);
    }

    /**
     * Write the value to the file path using file writer.
     *
     * @param value - 2 dimensional double array to write
     * @throws IOException
     */
    public abstract void write(double[][] value) throws IOException;

    /**
     * Close file writer
     *
     * @throws IOException
     */
    public abstract void close() throws IOException;
}
