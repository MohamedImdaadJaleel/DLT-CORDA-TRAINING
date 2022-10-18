import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

// Inheritance has been used through extending the Trade parent class
public class Main extends TradeHeader{

    public static void main(String[] args) throws ParseException, InterruptedException {

        Main obj = new Main();
        GeneralTrade obj3 = new GeneralTrade();
        TradeExtended obj2 = new TradeExtended();


        String HEADR = obj.structure.toString();
        String GTrade = obj3.structure.toString();
        String GTrade1 = obj3.structure2.toString();
        String GTrade2 = obj3.structure3.toString();
        String GTrade3 = obj3.structure4.toString();
        String EXTENDED4 = obj2.structure.toString();
        String EXTENDED6 = obj2.structure2.toString();


        myMethod.myMethod(HEADR,EXTENDED4,EXTENDED6,GTrade,GTrade1,GTrade2,GTrade3);

    }
}

