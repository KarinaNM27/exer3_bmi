public class BmiService {
    public float calculate(int weight, float growth) {
        float bmi = weight / (growth * growth);
        return bmi;
    }
}
