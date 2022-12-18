package web.model;

public class Car {
    private String model;
    private int series;
    private int years;

    public Car(String model, int series, int years) {
        this.model = model;
        this.series = series;
        this.years = years;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", years=" + years +
                '}';
    }
}
