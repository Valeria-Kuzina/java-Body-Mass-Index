public class BmiService {
    public int calculate(double weight, double height) {
        int bmi = (int) (weight * 10 / (height * height / 10000));
        return bmi;
    }
}
