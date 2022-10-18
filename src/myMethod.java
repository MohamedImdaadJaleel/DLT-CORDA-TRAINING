import java.util.ArrayList;
import java.util.List;

public class myMethod {
    static void myMethod(String HEADR, String EXTRADE1,String EXTRADE2,String GTrade,String GTrade1, String GTrade2, String GTrade3 ) {

        String HEADER = HEADR;
        List<String> CSV = new ArrayList();
        CSV.add(HEADR);
//        CSV.add(TRADE);

        System.out.println(HEADER);
        System.out.println(EXTRADE1);
        System.out.println(EXTRADE2);
        System.out.println(GTrade);
        System.out.println(GTrade1);
        System.out.println(GTrade2);
        System.out.println(GTrade3);

    }
}
