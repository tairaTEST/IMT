public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        int bmi = service.calculate(weight);
        System.out.println(bmi);
    }
}
