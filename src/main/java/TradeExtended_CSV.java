import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TradeExtended_CSV {
    private static final String SAMPLE_CSV_FILE = "./ExtendedTrade.csv";
    static void extended_TradeMethod(String EXTRADE1,String EXTRADE2) {


        List<String> CSV = new ArrayList();
        CSV.add(EXTRADE1);
        CSV.add(EXTRADE2);


        try (

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Tag","File Version","File Date","Direction","ItemID","Price","Quantity","Buyer","Seller","Nested Tags"));

        )
        {
            for (int i=0;i<CSV.size();i++){

                String tag = CSV.get(i).substring(1,6);
                String file_version = CSV.get(i).substring(8,12);
                String file_creation_time =CSV.get(i).substring(14,37);
                String direction =CSV.get(i).substring(39,43);
                String item_id =CSV.get(i).substring(45,57);
                String price =CSV.get(i).substring(59,65);
                String Qty =CSV.get(i).substring(67,68);
                String Buyer =CSV.get(i).substring(70,74);
                String Seller =CSV.get(i).substring(76,80);
                String Nested_tags =CSV.get(i).substring(82,132);

                csvPrinter.printRecord(tag,file_version,file_creation_time,direction,item_id,price,Qty,Buyer,Seller,Nested_tags);
            }


            csvPrinter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
