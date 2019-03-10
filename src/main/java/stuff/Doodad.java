package stuff;

import goods.Widget;

public class Doodad {
    public Doodad() {
        Widget widget = new Widget();
        System.out.println(widget.publicWidget);
        //cannot acccess the private, protected and empty access variables
    }
}
