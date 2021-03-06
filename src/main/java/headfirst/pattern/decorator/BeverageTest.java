package headfirst.pattern.decorator;

/**
 * @author : Lin Can
 * @description : 饮料测试
 * @modified ：By
 * @date : 2018/7/5 8:36
 */
public class BeverageTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ":" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ":" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + ":" + houseBlend.cost());
    }
}
