package decorator;
//Food arabirimini uygulayacak ve tüm yöntemlerini geçersiz kılacak bir VegFood sınıfı oluşturun.
public class VegFood implements Food {
    public String prepareFood(){
        return "Veg Food";
    }

    public double foodPrice(){
        return 50.0;
    }
}