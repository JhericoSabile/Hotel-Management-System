public class Housekeeping implements HotelService{
    private String roomNumber;

    public Housekeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public void performService() {
        cleanRoom();
    }
    public void cleanRoom(){
        System.out.println("Cleaning room: "+roomNumber);
    }
}
