package decorator;
//FoodDecorator sınıfını genişletecek ve tüm yöntemlerini
// geçersiz kılacak bir NonVegFood somut sınıfı oluşturun.
public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    @Override
    public String prepareFood(){
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";
    }
    @Override
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}
