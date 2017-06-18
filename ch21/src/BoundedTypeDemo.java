import javafx.scene.shape.Circle;

import java.awt.*;

/**
 * Created by dingjiacheng on 2017/6/18.
 */
public class BoundedTypeDemo {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2,2);
        Circle circle = new Circle(2);
        //System.out.println("Sama area? "+BoundedTypeDemo.<GenericMethodDemo>equalArea(rectangle,circle));
    }
    public static <E extends GenericMethodDemo> boolean equalArea(E object1,E object2){
        //return object1.getArea()==object2.getArea();
        return false;
    }

}
