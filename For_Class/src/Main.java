import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        double[][] data = {{650, 0.00498, 0.77146},
                           {650.5, 0.00498, 0.77091},
                           {651, 0.00497, 0.77035},
                           {651.5, 0.00497, 0.7698},
                           {652, 0.00497, 0.76925},
                           {652.5, 0.00497, 0.7687},
                           {653, 0.00497, 0.76814},
                           {653.5, 0.00497, 0.76759},
                           {654, 0.00496, 0.76705},
                           {654.5, 0.00496, 0.7665},
                           {655, 0.00496, 0.76595},
                           {655.5, 0.00496, 0.7654},
                           {656, 0.00496, 0.76486},
                           {656.5, 0.00496	, 0.76431},
                           {657, 0.00496, 0.76377},
                           {657.5, 0.00496, 0.76322},
                           {658, 0.00496, 0.76268}};

        CsvWriter writer = new CsvWriter("C:\\Users\\Lee Chang Yoon\\IdeaProjects\\For_Class\\src\\data.csv");

        writer.write(data);
        writer.close();


        CsvReader reader = new CsvReader("C:\\Users\\Lee Chang Yoon\\IdeaProjects\\For_Class\\src\\data.csv");
        reader.printValue();

        LongestWord lw = new LongestWord("C:\\Users\\Lee Chang Yoon\\IdeaProjects\\For_Class\\src\\words.txt");
        System.out.println("Found the longest word: " + lw.FindLW_Loop());
    }
}
