import java.io.*;
import java.util.*;

public class LongestWord {
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    BufferedReader br = null;

    public LongestWord(String filePath) throws IOException {
        this.br = new BufferedReader(new FileReader(filePath));
    }

    public String FindLW_Loop() throws IOException {
        long start = System.currentTimeMillis();
        String LW = " ";

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            else if (line.length() >= LW.length()) {
                LW = line;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\n실행 시간 : " + (end - start) / 1000.0);

        return LW;
    }
}

