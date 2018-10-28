package pl.sdacademy.designPatterns.duck.singleton;

import pl.sdacademy.designPatterns.duck.Duck;
import pl.sdacademy.designPatterns.duck.veterinary.ContactToVet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FarmerEagerSingleton {

    private static final FarmerEagerSingleton INSTANCE = new FarmerEagerSingleton();
    private List<Duck> ducks;
    private ContactToVet contactToVet;

    private FarmerEagerSingleton() {
        System.out.println(new Date() + "Farmer is initializing");
        ArrayList<Duck> notSynchronizedList = new ArrayList<>();
        ducks = Collections.synchronizedList(notSynchronizedList);
        contactToVet = new ContactToVet();
        System.out.println(new Date() + "Farmer is initialized");
    }

    public void askVet() {
        contactToVet.callVet();
    }

    public boolean addDuck(Duck duck) {
        return ducks.add(duck);
    }

    public boolean removeDuck(Duck duck) {
        return ducks.remove(duck);
    }

    public List<Duck> getAllDucks() {
        return new ArrayList<>(ducks);
    }

    public static FarmerEagerSingleton getInstance() {
        return INSTANCE;
    }

}
