public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(52, 1.62F);
        System.out.println(bmi);
    }


}
