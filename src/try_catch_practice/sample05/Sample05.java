package try_catch_practice.sample05;

public class Sample05 {

	public static void main(String[] args) {
        Car car = new Car();
        try {
            car.setCar(1234, -10.0);
        } catch (CarException e) {
            System.out.println(e + "が送出されました。");
        }
        car.show();
	}
}
