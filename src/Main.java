import com.company.details.Engine;
import com.company.professoins.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {

        Driver driver=new Driver("Суйналиев Жээналы Рустанович",5);
        System.out.println(driver.toString());

        Engine engine=new Engine(543,"BMW");
        System.out.println(engine);

        Car car=new Car("BMW E34","Sedan",1620,driver,engine);
        System.out.println(car.toString());
        car.start();

        Driver driver1=new Driver("Манапов Умар Султанович",20);
        Engine engine1=new Engine(252,"STI");
        Car car1=new Car("Mersedes-Bens","W211",1600,driver1,engine1);
        System.out.println(car1);
        car1.stop();

        Driver driver2=new Driver("Манапов Умар Султанович",20);
        Engine engine2=new Engine(252,"STI");
        Lorry lorry=new Lorry("Зил","Грузовик",2400,driver2,engine2,6000);

    }
}