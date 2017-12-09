
public class cardriver{
    public static void main(String[]args){
        car myCar = new car();
        car hisCar = new car("Black", 400, 3.5, "Honda" );
        car herCar = new car("Pink", 300, 2.5, "Volks");
        System.out.println(myCar + "\n" + hisCar + "\n" + herCar);
        myCar.setColor("Blue");
        myCar.setHorsepower(650);
        myCar.setEnginesize(6.5);
        myCar.setMake("Ferrari");
        System.out.println(myCar.getColor()+ "\n" +
                myCar.getHorsepower()+ "\n"
                + myCar.getEnginesize() + "\n"
                + myCar.getMake());

    }
}
