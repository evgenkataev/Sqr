import ru.netology.sqr.Sqr.services.SQRService;

public class main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrCount(200, 300));

    }

}