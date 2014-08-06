package exercises.august06.exercise1;

/**
 * Created by bw5 on 06/08/2014.
 */
public class StripedBass extends Fish {
    private Double length;

    public StripedBass(Double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Striped Bass";
    }

    @Override
    public Double size() {
        return this.length;
    }

    // We don't need to implement equals() and toString(), the
    // super class's methods will work just fine.
}
