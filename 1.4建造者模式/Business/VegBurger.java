package Business;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
