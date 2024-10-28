public class Car{
    private String licencePlate;
    private String brand;
    private String model;
    private String colour;

    public Car(String licencePlate, String brand, String colour, String model){
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    //Getters and Setters
    public String getLicencePlate(){
        return this.licencePlate;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getColour(){
        return this.colour;
    }

    public void setLicencePlate(String plate){
        this.licencePlate = plate;
    }
    public void setBrand(String brandName){
        this.brand = brandName;
    }
    public void setModel(String modelName){
        this.model = modelName;
    }
    public void setColour(String colourName){
        this.colour = colourName;
    }
}