package mpas.my_git;

public class Auto {
    private String  marka;
    private String   model;

    public Auto(String marka, String model) {
        this.marka = marka;
        this.model = model;


    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
