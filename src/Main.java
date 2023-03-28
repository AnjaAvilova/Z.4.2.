public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 108;
        double heightMeter = 1.87;
        int bmi = service.calculate((double) heightMeter, (double) weightKg);
        System.out.println(bmi);
    }
}