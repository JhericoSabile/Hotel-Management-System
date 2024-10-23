public class FrontDesk {

    public void coordinateValet(String plateNumber){
        Valet valet = new Valet(plateNumber);
        valet.performService();
    }
    public void coordinateHousekeeping(String roomNumber){
        Housekeeping housekeeping = new Housekeeping(roomNumber);
        housekeeping.cleanRoom();
    }
    public void coordinateCart(String numberOfCarts){
        Cart cart = new Cart(numberOfCarts);
        cart.requestCart();
    }

}
