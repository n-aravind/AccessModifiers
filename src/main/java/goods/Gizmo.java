package goods;

public class Gizmo {
    public Gizmo() {
        Widget widget = new Widget();
        System.out.println(widget.emptyWidget);
        System.out.println(widget.protectedWidget);
        System.out.println(widget.publicWidget);
        //Cannot access the private member variable
    }
}
