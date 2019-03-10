package stuff;

import goods.Widget;

public class Thingamajig extends Widget {
    public Thingamajig() {
        System.out.println(protectedWidget);
        System.out.println(publicWidget);
        //Cannot access the private and empty access modifiers
    }
}
