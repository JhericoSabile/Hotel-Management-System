public class Cart implements HotelService{

    private String numberOfCarts;

    public Cart (String numberOfCarts){
        this.numberOfCarts=numberOfCarts;
    }

    @Override
    public void performService() {
        requestCart();
    }

    public void requestCart(){
        System.out.println("Requesting cart: "+numberOfCarts);
    }

}
