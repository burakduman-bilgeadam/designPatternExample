package decorator;
//Food arabirimini uygulayacak ve tüm yöntemlerini geçersiz kılacak bir
// FoodDecorator soyut sınıfı oluşturun ve daha fazla gıdayı dekore etme yeteneğine sahip.
public abstract class FoodDecorator implements Food{
    private Food newFood;
    public FoodDecorator(Food newFood)  {
        this.newFood=newFood;
    }
    @Override
    public String prepareFood(){
        return newFood.prepareFood();
    }
    @Override
    public double foodPrice(){
        return newFood.foodPrice();
    }
}
