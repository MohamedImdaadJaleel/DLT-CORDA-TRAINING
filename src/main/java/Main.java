import java.text.ParseException;


public class Main extends TradeHeader{  // Inheritance has been used through extending the Trade parent class

    public static void main(String[] args) throws ParseException, InterruptedException {

        Main header_object = new Main();
        GeneralTrade trade_object = new GeneralTrade();
        TradeExtended ex_trade_object = new TradeExtended();
        Footer footer_object = new Footer();

        // Header Structure CSV Converting
        String HEADR = header_object.structure.toString();
        TradeHeader_CSV.header_Method(HEADR);


        // Extended Trade Structure CSV Converting
        String EXTENDED4 = ex_trade_object.structure.toString();
        String EXTENDED6 = ex_trade_object.structure2.toString();
        TradeExtended_CSV.extended_TradeMethod(EXTENDED4,EXTENDED6);

        // Trade Structure CSV Converting
        String GTrade = trade_object.structure.toString();
        String GTrade1 = trade_object.structure2.toString();
        String GTrade2 = trade_object.structure3.toString();
        String GTrade3 = trade_object.structure4.toString();
        GeneralTrade_CSV.general_TradeMethod(GTrade,GTrade1,GTrade2,GTrade3);

        // Footer Structure CSV Converting
        String FooterTrade = footer_object.structure.toString();
        Footer_CSV.footer_Method(FooterTrade);

        System.out.println("<<<<<<<< Successfully Converted the Structures to CSV >>>>>>>>>>");


    }
}

