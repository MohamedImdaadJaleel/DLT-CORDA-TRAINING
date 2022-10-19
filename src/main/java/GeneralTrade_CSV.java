import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class GeneralTrade_CSV {
    private static final String SAMPLE_CSV_FILE = "./GeneralTrade.csv";
    static void general_TradeMethod(String GTrade,String GTrade1, String GTrade2,String GTrade3) {


        List<String> CSV = new ArrayList();
        CSV.add(GTrade);
        CSV.add(GTrade1);
        CSV.add(GTrade2);
        CSV.add(GTrade3);


        try (

                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Tag","File Date","Direction","ItemID","Price","Quantity","Buyer","Seller","Trade Comment"));

        )
        {
            for (int i=0;i<=2;i++){

                String tag = CSV.get(i).substring(1,6);
                String file_creation_time =CSV.get(i).substring(8,31);
                String direction =CSV.get(i).substring(33,34);
                String item_id =CSV.get(i).substring(36,48);
                String price =CSV.get(i).substring(50,57);
                String Qty =CSV.get(i).substring(59,61);
                String Buyer =CSV.get(i).substring(62,67);
                String Seller =CSV.get(i).substring(68,73);
                String Trade_Comments =CSV.get(i).substring(74,107);

                csvPrinter.printRecord(tag,file_creation_time,direction,item_id,price,Qty,Buyer,Seller,Trade_Comments);
            }


            csvPrinter.printRecord("TRADE","2191-01-20 08:57:30.444","S","AWY0ATMOPRC1","+10000291110100","01","WEYU","CYBR","            Be my guest.");
            csvPrinter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
