import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TradeHeader_CSV {
    private static final String SAMPLE_CSV_FILE = "./Header.csv";
    static void header_Method(String HEADR) {


        List<String> CSV = new ArrayList();
        CSV.add(HEADR);
        System.out.println(CSV);

        try (

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Tag","Trade Version","Trade Date","File Comment"));

        )
        {
            for (int i=0;i<CSV.size();i++){

                String tag = CSV.get(i).substring(1,6);
                String version = CSV.get(i).substring(11,12);
                String file_creation_time =CSV.get(i).substring(14,37);
                String Trade_Comments =CSV.get(i).substring(39,88);


                csvPrinter.printRecord(tag,version,file_creation_time,Trade_Comments);
            }


            csvPrinter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
