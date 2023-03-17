public class BmiService {
    public int calculate(int weight) {
        int height = (182*182)/10_000;
        int result;
        {
            result = weight / height;
        }
        return result;
    }
}
