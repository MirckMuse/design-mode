package Business;

import Item.Packing;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
