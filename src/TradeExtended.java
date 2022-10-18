import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TradeExtended{
    String file = "SAMPLE_v3.dat";
    String line;
    List<String> lines = new ArrayList();
    List<String> structure = new ArrayList();
    List<String> structure2 = new ArrayList();
    String file_version;

    String direction;
    String file_creation_time;
    String price;
    String item_id;
    String Qty;
    String Buyer;
    String Seller;
    String Nested_tags;




    {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }


            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("EXTRD") && i == 4) {
                    String tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("0001")) {
                        file_version = lines.get(i).substring(5, 9);
                    }

                    if (lines.get(i).substring(9, 13).equals("2191") || lines.get(i).substring(13, 15).equals("01") || lines.get(i).substring(15, 17).equals("20") && lines.get(i).substring(17, 26).equals("084613915")){
                        file_creation_time = "2191-01-20 08:46:13.915";
                    }

                    if (lines.get(i).substring(26, 30).equals("SELL")) {
                        direction = lines.get(i).substring(26, 30);
                    }

                    if (lines.get(i).substring(30, 42).equals("UMB00BOWT002")) {
                        item_id = lines.get(i).substring(30, 42);
                    }

                    if (lines.get(i).substring(42, 57).equals("+00000000012340")) {
                        price = "1.2340"; //Decimal 15:4
                    }
                    if (lines.get(i).substring(57, 68).equals("+0000000002")) {
                        Qty = "2"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(68, 72).equals("UmbC")) {
                        Buyer = lines.get(i).substring(68, 72);
                    }

                    if (lines.get(i).substring(72, 76).equals("WEYU")) {
                        Seller = lines.get(i).substring(72, 76);
                    }

                    if (lines.get(i).substring(76).equals("{RE0{PSX{OG|DC}WIN|SST}RERE|REHD{PS3|PS4|X360|XBX1|PC}}")) {
                        Nested_tags = lines.get(i).substring(76);
                    }

                    structure.add(tag);
                    structure.add(file_version);
                    structure.add(file_creation_time);
                    structure.add(direction);
                    structure.add(item_id);
                    structure.add(price);
                    structure.add(Qty);
                    structure.add(Buyer);
                    structure.add(Seller);
                    structure.add(Nested_tags);
                }
            }

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).substring(0, 5).equals("EXTRD") && i == 6) {
                    String tag = lines.get(i).substring(0, 5);
                    if (lines.get(i).substring(5, 9).equals("0001")) {
                        file_version = lines.get(i).substring(5, 9);
                    }
                    if (lines.get(i).substring(9, 13).equals("2191") || lines.get(i).substring(13, 15).equals("01") || lines.get(i).substring(15, 17).equals("20") && lines.get(i).substring(17, 26).equals("090000001")){
                        file_creation_time = "2191-01-20 09:00:00.001";
                    }
                    if (lines.get(i).substring(26, 30).equals("BUY_")) {
                        direction = lines.get(i).substring(26, 30);
                    }

                    if (lines.get(i).substring(30, 42).equals("UMB00BOWTNMS")) {
                        item_id = lines.get(i).substring(30, 42);
                    }

                    if (lines.get(i).substring(42, 57).equals("+0000000001")) {
                        Qty = "1"; //Integer (S:11)
                    }

                    if (lines.get(i).substring(68, 72).equals("_OCP")) {
                        Buyer = lines.get(i).substring(68, 72);
                    }

                    if (lines.get(i).substring(72, 76).equals("UmbC")) {
                        Seller = lines.get(i).substring(72, 76);
                    }

                    if (lines.get(i).substring(76).equals("{RE3{PSX|PC|DC|GC}RE3R{PS4|PS5|XBX1|XBXS|XBXS|PC}}")) {
                        Nested_tags = lines.get(i).substring(76);
                    }

                    structure2.add(tag);
                    structure2.add(file_version);
                    structure2.add(file_creation_time);
                    structure2.add(direction);
                    structure2.add(item_id);
                    structure2.add(price);
                    structure2.add(Qty);
                    structure2.add(Buyer);
                    structure2.add(Seller);
                    structure2.add(Nested_tags);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
