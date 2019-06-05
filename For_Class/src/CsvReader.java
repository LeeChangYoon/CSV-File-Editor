import java.io.*;
import java.util.Arrays;

public class CsvReader extends AbstractCsvReader{

    public CsvReader(String filePath) throws IOException {
        super(filePath);
    }

    @Override
    int[] validateCsvFile(String filePath) throws IOException {
        int[] result = new int[2];
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        int nColumn = -1;
        int nRow = 0;

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            String[] contents = line.split(",");

            if (nColumn == -1) {
                nColumn = contents.length;
                System.out.println("File cracked.\n");
            }

            else if (nColumn != contents.length) {
                return null;
            }

            else {
                nColumn = contents.length;
                nRow++;
            }
        }
        result[0] = nRow;
        result[1] = nColumn;

        return result;
    }

    @Override
    void readCsv(String filePath, double[][] v) throws IOException, NumberFormatException{
        int idx = 0;
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        while (true) {
            String line = br.readLine();
            if (line == null || idx  == v.length) break;
            String[] contents = line.split(",");

            for (int i = 0; i < contents.length; i++) {
                v[idx][i] = Double.parseDouble(contents[i]);
            }
            idx++;
        }
        System.out.println("File loaded.\n");
    }

    @Override
    double[][] getValue() {
        System.out.println("Value returned.\n");
        return value;
    }

    @Override
    void printValue() {
        System.out.println("File printed.\n");
        for (int i = 0; i < value.length; i++) {
            System.out.println(Arrays.toString(value[i]));
        }
    }
}
