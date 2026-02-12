package lab1.problem1;
public class Data {

    private double sum;
    private double max;
    private int count;

    // Конструктор
    public Data() {
        this.sum = 0.0;
        this.count = 0;

        this.max = -Double.MAX_VALUE;
    }


    public void addValue(double value) {

        if (count == 0) {
            max = value;
        } else {

            if (value > max) {
                max = value;
            }
        }
        sum += value;
        count++;
    }


    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }


    public double getLargest() {

        if (count == 0) {
            return 0;
        }
        return max;
    }
}