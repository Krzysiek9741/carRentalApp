package pl.kf.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQuery(name = "getAllCars", query = "FROM Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String mark;
    private String model;
    private Integer yearOfProduction;
    private boolean isRented = false;
    private String imageUrl;

    public Car() {
    }

    public Car(String mark, String model, Integer yearOfProduction) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(Long id, String mark, String model, Integer yearOfProduction) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(Long id, String mark, String model, Integer yearOfProduction, String imageUrl) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.imageUrl = imageUrl;
    }

    public Car(String mark, String model, Integer yearOfProduction, String imageUrl) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", pl.kf.model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isRented=" + isRented +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static List<Car> makeList(Car... cars){
        List<Car> carsList = new ArrayList<>();
        for (Car car : cars){
            carsList.add(car);
        }
        return carsList;
    }

    public static Car findCar(List<Car> cars, Long id) {
        Car selectedCar = null;
        for (Car car : cars) {
            if (car.getId() == id) {
                selectedCar = car;
                break;
            }
        }
        return selectedCar;
    }
}
