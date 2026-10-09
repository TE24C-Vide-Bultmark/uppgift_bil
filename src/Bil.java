public class Bil {
    private String brand = "saknas";
    // (ska aldrig vara tomt eller null)

    private String model = "saknas";
    // (ska aldrig vara tomt eller null)

    private String licenseNumber = "saknas";
    // (ska aldrig vara tomt eller null)

    private int year = 0;
    // (får ej vara under 1860 eller högre än nuvarande år

    private int velocity;

    // konstruktor
    Bil(String brand, String model, String licenseNumber, int year){
        if (brand == "" || brand == null) {
            throw new IllegalArgumentException("illegal brand entered");
        }
        else{
            this.brand = brand;
        }
        if (model == "" || model == null) {
            throw new IllegalArgumentException("illegal model entered");
        }
        else{
            this.model = model;
        }
        if (licenseNumber == "" || licenseNumber == null) {
            throw new IllegalArgumentException("illegal license number entered");
        }
        else{
            this.licenseNumber = licenseNumber;
        }
        if (1860<year || year<2026) {
            this.year = year;
        }
        else{
            throw new IllegalArgumentException("illegal year entered");
        }
        
        this.velocity = 0;
    }

    // getters
    public String GetBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String GetLicenseNumber(){
        return licenseNumber;
    }
    public int getYear(){
        return year;
    }
    public int getVelocity(){
        return velocity;
    }

    // setters
    public void setModel(String model){
        if (model == "" || model == null) {
            throw new IllegalArgumentException("illegal brand entered");
        }
        else{
            this.model = model;
        }
    }

    // metoder
    public void accelerate(int acceleration){
        if (acceleration <= 0) {
            throw new IllegalArgumentException("acceleration must be greater than zero");
        }
        else{
            this.velocity += acceleration;
        }
    }
    public void brake(int decrease){
        if (decrease <= 0) {
            throw new IllegalArgumentException("decrease must be greater than zero");
        }
        else{
            this.velocity -= decrease;
        }
    }
    public String toString(Bil Car){
        return "The car: brand: "+Car.brand+", model: "+Car.model+", liense number: "+Car.licenseNumber+"year: "+Car.year;
    }
}