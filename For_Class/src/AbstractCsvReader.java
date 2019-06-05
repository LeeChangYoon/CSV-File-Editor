import java.io.IOException;

/**
 * Abstract class of CSV File Reader.
 *
 */
public abstract class AbstractCsvReader {
    /**
     * Read value from the csv file.
     */
    protected double[][] value;

    /**
     * Read csv files to value variable.
     *
     * @param filePath - File path to read
     * @throws IOException
     */
    public AbstractCsvReader(String filePath) throws IOException{
        int[] csvSize = validateCsvFile(filePath);

        if(csvSize == null) {
            return;
        }

        this.value = new double[csvSize[0]][csvSize[1]];

        readCsv(filePath, this.value);
    }

    /**
     * This method validates the lengths of row and column of the csv file.
     * Column must be same through all rows.
     *
     * @param filePath - File path to read.
     * @return - Integer array. Its length is 2. <br />
     * return[0] is a number of row. return[1] is a number of column.<br />
     * null if column length of all rows does not match.
     *
     * @throws IOException
     */
    abstract int[] validateCsvFile(String filePath) throws IOException;

    /**
     * This method read values from the csv file to store to the value variable.
     * @param filePath - File path to read
     * @param v - double array variable to be stored.
     * @throws IOException
     * @throws NumberFormatException
     */
    abstract void readCsv(String filePath, double[][] v) throws IOException, NumberFormatException;

    /**
     *
     * @return - returns the read values.
     */
    abstract double[][] getValue();

    /**
     * Print the read values.
     */
    abstract void printValue();
}
