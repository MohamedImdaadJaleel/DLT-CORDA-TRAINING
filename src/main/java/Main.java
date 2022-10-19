import java.text.ParseException;


public class Main extends TradeHeader{  // Inheritance has been used through extending the Trade parent class

    public static void main(String[] args) throws ParseException, InterruptedException {

        Main obj = new Main();
        GeneralTrade obj3 = new GeneralTrade();
        TradeExtended obj2 = new TradeExtended();
        Footer obj4 = new Footer();

        // Header Structure CSV Converting
        String HEADR = obj.structure.toString();
        TradeHeader_CSV.header_Method(HEADR);


        // Extended Trade Structure CSV Converting
        String EXTENDED4 = obj2.structure.toString();
        String EXTENDED6 = obj2.structure2.toString();
        TradeExtended_CSV.extended_TradeMethod(EXTENDED4,EXTENDED6);

        // Trade Structure CSV Converting
        String GTrade = obj3.structure.toString();
        String GTrade1 = obj3.structure2.toString();
        String GTrade2 = obj3.structure3.toString();
        String GTrade3 = obj3.structure4.toString();
        GeneralTrade_CSV.general_TradeMethod(GTrade,GTrade1,GTrade2,GTrade3);

        // Footer Structure CSV Converting
        String FooterTrade = obj4.structure.toString();
        Footer_CSV.footer_Method(FooterTrade);



    }
}

