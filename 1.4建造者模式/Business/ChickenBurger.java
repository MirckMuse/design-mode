package Business;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
