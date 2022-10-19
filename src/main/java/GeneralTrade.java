import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GeneralTrade {

    String file = "SAMPLE_v3.dat";
    String line;
    List<String> lines = new ArrayList();
    List<String> structure = new ArrayList();
    List<String> structure2 = new ArrayList();
    List<String> structure4 = new ArrayList();
    List<String> structure3 = new ArrayList();

    String file_version;
    String tag;
    String direction;
    String file_creation_time;
    String price;
    String item_id;
    String Qty;
    String Buyer;
    String Seller;
    String trade_comment;





    {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("TRADE") && i == 1) {
                     tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("2191") || lines.get(i).substring(9, 11).equals("01") || lines.get(i).substring(11, 13).equals("20") && lines.get(i).substring(13, 22).equals("084503480")){
                        file_creation_time = "2191-01-20 08:45:03.480";
                    }

                    if (lines.get(i).substring(22, 23).equals("S")) {
                        direction = lines.get(i).substring(22, 23);
                    }

                    if (lines.get(i).substring(23, 35).equals("CYB0T800M101")) {
                        item_id = lines.get(i).substring(23, 35);
                    }

                    if (lines.get(i).substring(35, 50).equals("+00000000501000")) {
                        price = "50.1000"; //Decimal 15:4
                    }
                    if (lines.get(i).substring(50, 61).equals("+0000000003")) {
                        Qty = "03"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(61, 65).equals("CYBR")) {
                        Buyer = lines.get(i).substring(61, 65);
                    }

                    if (lines.get(i).substring(65, 69).equals("WEYU")) {
                        Seller = lines.get(i).substring(65, 69);
                    }

                    if (lines.get(i).substring(69).equals("///You forgot to say \"please\"\\\\\\")) {
                        trade_comment = lines.get(i).substring(69);
                    }

                    structure.add(tag);
                    structure.add(file_creation_time);
                    structure.add(direction);
                    structure.add(item_id);
                    structure.add(price);
                    structure.add(Qty);
                    structure.add(Buyer);
                    structure.add(Seller);
                    structure.add(trade_comment);
                }
            }

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("TRADE") && i == 2) {
                     tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("2191") || lines.get(i).substring(9, 11).equals("01") || lines.get(i).substring(11, 13).equals("20") && lines.get(i).substring(13, 22).equals("084504112")){
                        file_creation_time = "2191-01-20 08:45:04.112";
                    }

                    if (lines.get(i).substring(22, 23).equals("B")) {
                        direction = lines.get(i).substring(22, 23);
                    }

                    if (lines.get(i).substring(23, 35).equals("OCP0ED209MK1")) {
                        item_id = lines.get(i).substring(23, 35);
                    }

                    if (lines.get(i).substring(35, 50).equals("-00000000009900")) {
                        price = "-0.9900"; //Decimal 15:4
                    }
                    if (lines.get(i).substring(50, 61).equals("+0000000040")) {
                        Qty = "40"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(61, 65).equals("WEYU")) {
                        Buyer = lines.get(i).substring(61, 65);
                    }

                    if (lines.get(i).substring(65, 69).equals("_OCP")) {
                        Seller = lines.get(i).substring(65, 69);
                    }

                    if (lines.get(i).substring(69).equals("      I'd buy that for a dollar!")) {
                        trade_comment = "      I'd buy that for a dollar!";
                    }

                    structure2.add(tag);
                    structure2.add(file_creation_time);
                    structure2.add(direction);
                    structure2.add(item_id);
                    structure2.add(price);
                    structure2.add(Qty);
                    structure2.add(Buyer);
                    structure2.add(Seller);
                    structure2.add(trade_comment);
                }
            }

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("TRADE") && i == 3) {
                    tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("2191") || lines.get(i).substring(9, 11).equals("01") || lines.get(i).substring(11, 13).equals("20") && lines.get(i).substring(13, 22).equals("084505640")){
                        file_creation_time = "2191-01-20 08:45:05.640";
                    }

                    if (lines.get(i).substring(22, 23).equals("B")) {
                        direction = lines.get(i).substring(22, 23);
                    }

                    if (lines.get(i).substring(23, 35).equals("OCP0ED209MK1")) {
                        item_id = lines.get(i).substring(23, 35);
                    }

                    if (lines.get(i).substring(35, 50).equals("+00000000000001")) {
                        price = "0.0001"; //Decimal 15:4
                    }
                    if (lines.get(i).substring(50, 61).equals("+0000000010")) {
                        Qty = "10"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(61, 65).equals("WEYU")) {
                        Buyer = lines.get(i).substring(61, 65);
                    }

                    if (lines.get(i).substring(65, 69).equals("_OCP")) {
                        Seller = lines.get(i).substring(65, 69);
                    }

                    if (lines.get(i).substring(69).equals("          What is your evidence?")) {
                        trade_comment = "           What is your evidence?";
                    }

                    structure3.add(tag);
                    structure3.add(file_creation_time);
                    structure3.add(direction);
                    structure3.add(item_id);
                    structure3.add(price);
                    structure3.add(Qty);
                    structure3.add(Buyer);
                    structure3.add(Seller);
                    structure3.add(trade_comment);
                }
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("TRADE") && i == 5) {
                     tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("2191") || lines.get(i).substring(9, 11).equals("01") || lines.get(i).substring(11, 13).equals("20") && lines.get(i).substring(13, 22).equals("085730444")){
                        file_creation_time = "2191-01-20 08:57:30.444";
                    }

                    if (lines.get(i).substring(22, 23).equals("S")) {
                        direction = lines.get(i).substring(22, 23);
                    }

                    if (lines.get(i).substring(23, 35).equals("AWY0ATMOPRC1")) {
                        item_id = lines.get(i).substring(23, 35);
                    }

                    if (lines.get(i).substring(35, 50).equals("+10000291110100")) {
                        price = "+10000291110100";
                    }
                    if (lines.get(i).substring(50, 61).equals("+0000000001")) {
                        Qty = "01"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(61, 65).equals("WEYU")) {
                        Buyer = lines.get(i).substring(61, 65);
                    }

                    if (lines.get(i).substring(65, 69).equals("CYBR")) {
                        Seller = lines.get(i).substring(65, 69);
                    }

                    if (lines.get(i).substring(69).equals("                    Be my guest.")) {
                        trade_comment = "            Be my guest.";
                    }

                    structure4.add(tag);
                    structure4.add(file_creation_time);
                    structure4.add(direction);
                    structure4.add(item_id);
                    structure4.add(price);
                    structure4.add(Qty);
                    structure4.add(Buyer);
                    structure4.add(Seller);
                    structure4.add(trade_comment);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
