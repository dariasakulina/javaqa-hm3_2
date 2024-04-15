public class BmiService {

    public int calculate(double kg, double m) {
        int result = (int) (kg / Math.pow(m, 2));
        {
        }
        return result;
    }
}