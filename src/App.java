void main(){
    Bil car2 = new Bil("volvo", "XC90", "ABC123", 2019);
    Bil car3 = new Bil("Ford", "idk", "XYZ987", 2001);
    IO.println(car2);
    IO.println(car2.toString());
    IO.println(toString());
    IO.println(car2.toString(car2));
    IO.println(car3.toString(car2));
    IO.println(car3.toString(car3));
    car2.setModel("toyota");
    IO.println(car2.toString(car2));
    IO.println(car3.GetLicenseNumber());
    IO.println(car2.GetLicenseNumber());
    IO.println(car2.getVelocity());
    car2.accelerate(100);
    IO.println(car2.getVelocity());
    car2.brake(50);
    IO.println(car2.getVelocity());

    while (true) {
        IO.readln();
    }
}
