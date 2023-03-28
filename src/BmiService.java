class BmiService {

    public int calculate(double heightMeter, double weightKg) {

        int bmi = (int) (weightKg / heightMeter / heightMeter);
        return bmi;
    }
}