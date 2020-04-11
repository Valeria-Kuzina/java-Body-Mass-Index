public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // TODO: указать в weight массу тела в кг, в height - рост в см.
        double bmi = bmiService.calculate(67, 170);
        System.out.println("Ваш индекс массы тела = " + bmi / 10);
    }
}
