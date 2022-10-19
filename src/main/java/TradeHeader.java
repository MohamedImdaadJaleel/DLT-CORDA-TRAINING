import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class TradeHeader {
            String file = "SAMPLE_v3.dat";
            String line;
            List<String> lines = new ArrayList();
            List<String> structure = new ArrayList();
            String tag;
            String file_version;

            String file_creation_time;
            String file_comment;



    {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("HEADR") && i == 0) {
                    tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("0004") || lines.get(i).substring(5, 9).equals("0005")) {
                        file_version = lines.get(i).substring(5, 9);
                    }

                    if (lines.get(i).substring(9, 13).equals("2191") || lines.get(i).substring(13, 15).equals("01") || lines.get(i).substring(15, 17).equals("20") || lines.get(i).substring(17, 26).equals("093025001")){
                        file_creation_time = "2191-01-20 09:30:25.001";
                    }

                    if (lines.get(i).substring(26).equals("{45}Have you watched C-beams glitter in the dark?")){
                        file_comment = lines.get(i).substring(26);
                    }

                    structure.add(tag);
                    structure.add(file_version);
                    structure.add(file_creation_time);
                    structure.add(file_comment);
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

