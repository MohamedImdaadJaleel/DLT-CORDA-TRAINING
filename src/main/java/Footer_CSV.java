import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Footer_CSV {
    private static final String SAMPLE_CSV_FILE = "./FooterTrade.csv";
    static void footer_Method(String FooterTrade) {


        List<String> CSV = new ArrayList();
        CSV.add(FooterTrade);


        try (

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Tag","Number of Trade","Number of Characters"));
        )
        {
            for (int i=0;i<CSV.size();i++){

                String tag = CSV.get(i).substring(1,6);
                String number_of_trade = CSV.get(i).substring(8,10);
                String number_of_characters =CSV.get(i).substring(11,14);

                csvPrinter.printRecord(tag,number_of_trade,number_of_characters);
            }


            csvPrinter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
