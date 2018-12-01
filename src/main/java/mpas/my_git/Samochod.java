package mpas.my_git;

public class Samochod {
    private String  marka;
    private String   model;

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;


    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
