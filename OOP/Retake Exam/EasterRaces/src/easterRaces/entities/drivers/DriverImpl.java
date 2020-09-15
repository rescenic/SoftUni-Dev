package easterRaces.entities.drivers;

import easterRaces.entities.cars.Car;
import easterRaces.repositories.interfaces.CarRepository;

import static easterRaces.common.ExceptionMessages.CAR_INVALID;
import static easterRaces.common.ExceptionMessages.INVALID_NAME;

public class DriverImpl implements Driver {
    private String name;
    private Car car;
    private int numberOfWins;
    private boolean canParticipate;

    public DriverImpl(String name) {
        setName(name);
    }

    public void setName(String name){
        if (name.matches("\\s+")||name.length()<5){
            throw new IllegalArgumentException(String.format(INVALID_NAME,name,5));
        }
        else{
            this.name = name;
        }
    }

    @Override
    public String getName() {
    return this.name;
    }

    @Override
    public Car getCar() {
        return this.car;
    }

    @Override
    public int getNumberOfWins() {
        return this.numberOfWins;
    }

    @Override
    public void addCar(Car car) {
        if (car==null){
            throw new IllegalArgumentException(CAR_INVALID);
        }
        else {
            this.car=car;
            this.canParticipate=true;
            CarRepository repo = new CarRepository(); //TODO make sure this makes sense when running
            repo.add(car);
        }
    }

    @Override
    public void winRace() {
        this.numberOfWins++;
    }

    @Override
    public boolean getCanParticipate() {
        return this.canParticipate;
    }
}