import java.io.*;

public class CsvWriter extends AbstractCsvWriter {
    double[][] data = null;

    public CsvWriter(String filePath) throws IOException {
        super(filePath);
    }

    @Override
    public void write(double[][] value) throws IOException {
        FileWriter fw = super.fout;

        for (double[] line : value) {
            for (double element : line) {
                fw.append(Double.toString(element));
                fw.append(",");
            }
            fw.append("\r\n");
        }
        fw.flush();
    }

    @Override
    public void close() throws IOException {
        super.fout.close();
        System.out.println("File closed.\n");
    }
}
