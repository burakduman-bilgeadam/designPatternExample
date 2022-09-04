package decorator;
//FoodDecorator sınıfını genişletecek ve tüm yöntemlerini
// geçersiz kılacak bir ChineeseFood beton sınıfı oluşturun.
public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood)    {
        super(newFood);
    }
    @Override
    public String prepareFood(){
        return super.prepareFood() +" With Fried Rice and Manchurian  ";
    }
    @Override
    public double foodPrice()   {
        return super.foodPrice()+65.0;
    }
}
