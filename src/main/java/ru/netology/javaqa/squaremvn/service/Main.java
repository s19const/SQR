import ru.netology.javaqa.squaremvn.service.squareService;

public class Main {

    public static void main(String[] args) {
        squareService service = new squareService();
        int low = 100;
        int high = 500;
        int x = service.calcSQR(low, high);

    }
}
