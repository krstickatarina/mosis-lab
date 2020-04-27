package myplaces.mosis.elfak.rs;

public class MyPlace {

    String name;
    String description;

    public MyPlace(String nme, String desc)
    {
        this.name = nme;
        this.description = desc;
    }

    public MyPlace(String nme)
    {
        this(nme, "");
    }

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return description;
    }

    public void setName(String nme)
    {
        this.name = nme;
    }

    public void setDesc(String desc)
    {
        this.description = desc;
    }

    @Override
    public String toString()
    {
        return this.name;
    }

}
