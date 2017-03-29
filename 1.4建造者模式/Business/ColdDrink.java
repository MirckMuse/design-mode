package Business;

import Item.*;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
