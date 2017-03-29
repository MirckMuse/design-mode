package Business;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
