import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.length() > 0) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();

            System.out.println("Word count written to " + args[1]);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}