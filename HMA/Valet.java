public class Valet implements HotelService{
    private String plateNumber;

   public Valet (String plateNumber){
       this.plateNumber=plateNumber;
   }

    @Override
    public void performService() {
         pickUpVehicle();
    }

    void pickUpVehicle(){
       System.out.println("Valet is picking up the vehicle with plate number: "+plateNumber);
   }

}
