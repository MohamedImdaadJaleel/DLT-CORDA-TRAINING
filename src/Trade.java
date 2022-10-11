import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Trade {
            String file = "SAMPLE_v3.dat";
            String line;
            List<String> lines = new ArrayList();
            List<String> structure = new ArrayList();

            //String tag;
            String fileVersion;
            String fileDate;
            String Year;
            String Date;
            String Month;



    {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("HEADR") && i == 0) {
                    String tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("0004") || lines.get(i).substring(5, 9).equals("0005")) {
                        fileVersion = lines.get(i).substring(5, 9);
                    } else {
                        fileVersion = "Invalid File Version Inserted";
                    }
                    if (lines.get(i).substring(10,13).equals("2191")|| lines.get(i).substring(14, 15).equals("01") || lines.get(i).substring(16, 17).equals("20")) {
                        Year = lines.get(i).substring(10,13);
                        Month = lines.get(i).substring(14,15);
                        Month = lines.get(i).substring(16,17);

                    } else {
                        fileDate = "Invalid Date Inserted";
                    }

                    structure.add(tag +" "+ "tag");
                    structure.add(fileVersion + " " + "File Version");
                    structure.add(Year + "" + "Year");
                    structure.add(Month + "" + "Month");
                    structure.add(Date + "" + "Date");

                    System.out.println(Year+ "year");
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

