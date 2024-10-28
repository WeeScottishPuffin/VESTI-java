public class Licence{
    private Car licenceHolder;
    private Garage validGarage;

    public Licence(Car licenceHolder, Garage validGarage){
        this.licenceHolder = licenceHolder;
        this.validGarage= validGarage;
    }

    //Getters and Setters
    public Car getHolderCar(){
        return this.licenceHolder;
    }
    public Garage getValidGarage(){
        return this.validGarage;
    }

    //Methods
    public boolean getValidInGarage(Garage garage){
        return this.validGarage.equals(garage);
    }

}