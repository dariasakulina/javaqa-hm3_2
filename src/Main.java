public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg = 98; // вес в кг
        double m = 1.87; // рост в метрах
        int bmi = service.calculate(kg, m);
        System.out.println(bmi);
    }
}