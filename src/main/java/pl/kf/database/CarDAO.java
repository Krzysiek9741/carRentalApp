package pl.kf.database;

import pl.kf.model.Car;

import javax.persistence.*;
import java.util.List;

public class CarDAO {
    private static CarDAO ourInstance = new CarDAO();

    public static CarDAO getInstance() {
        return ourInstance;
    }

    private CarDAO() {
    }

    private EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("cars");

    private EntityManager entityManager = entityManagerFactory.createEntityManager();


    private EntityTransaction tx = entityManager.getTransaction();

    public void addNewCar(String mark, String model, Integer yearOfProduction, String imgUrl  ) {

        tx.begin();
        Car newCar = new Car(mark, model, yearOfProduction, imgUrl);
        entityManager.persist(newCar);
        tx.commit();
    }

    public Car findCarById(Long id){
        Car car = entityManager.find(Car.class, id);
        return car;
    }

    public List<Car> allCarsList(){
        TypedQuery<Car> query1 = entityManager.createNamedQuery("getAllCars", Car.class);
        List<Car> cars = query1.getResultList();
        return cars;
    }

    public void rentCar(Long id){
        tx.begin();
        Car car = findCarById(id);
        car.setRented(true);
        entityManager.merge(car);
        tx.commit();
    }

    public void returnCar(Long id){
        tx.begin();
        Car car = findCarById(id);
        car.setRented(false);
        entityManager.merge(car);
        tx.commit();
    }
}
