import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Footer {

    String file = "SAMPLE_v3.dat";
    String line;
    List<String> lines = new ArrayList();
    List<String> structure = new ArrayList();
    String tag;
    String number_of_char;
    String number_of_trade;


    {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("FOOTR") && i == 7) {
                    tag = lines.get(i).substring(0, 5);


                    if (lines.get(i).substring(5,15).equals("0000000006")) {
                        number_of_trade = "6";
                    }

                    if (lines.get(i).substring(15, 25).equals("0000000661")) {
                        number_of_char = "661";
                    }

                    structure.add(tag);
                    structure.add(number_of_trade);
                    structure.add(number_of_char);

                }
            }



        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
