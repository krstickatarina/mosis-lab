package myplaces.mosis.elfak.rs;

import java.util.ArrayList;

public class MyPlacesData {

    private ArrayList<MyPlace> myPlaces;

    private MyPlacesData(){

        myPlaces = new ArrayList<MyPlace>();
    }

    private static class SingletonHolder
    {
        public static final MyPlacesData instance = new MyPlacesData();
    }

    public static MyPlacesData getInstance(){

        return SingletonHolder.instance;
    }

    public ArrayList<MyPlace> getMyPlaces()
    {
        return myPlaces;
    }

    public void addNewPlace(MyPlace place)
    {
        myPlaces.add(place);
    }

    public MyPlace getPlace(int index)
    {
        return myPlaces.get(index);
    }

    public void deletePlace(int index)
    {
        myPlaces.remove(index);
    }

}
