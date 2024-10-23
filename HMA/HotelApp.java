public class HotelApp {
    public static void main(String[] args) {
        FrontDesk fd = new FrontDesk();

        fd.coordinateCart("ABCD123");
        fd.coordinateValet("123BC");
        fd.coordinateHousekeeping("2123");
    }
}
