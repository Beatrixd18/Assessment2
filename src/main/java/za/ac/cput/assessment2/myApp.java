package za.ac.cput.assessment2;

/**
 * Created by student on 2015/02/12.
 */
public class myApp {

    private String name;

    public float floatNum()
    {
        float fl =(float) 30.98;
        return fl;
    }


    public int findInt()
    {
        return 7;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean truth()
    {
        return true;
    }

    public boolean fals()
    {
        return false;
    }

    public String nameNull()
    {
        String nameN = null;
        return nameN;
    }

    public void time()
    {
        for(int i =1; i>0; i++)
        {
            System.out.println("Hello" +i);
        }

    }

    public String arrayContent1()
    {
        String [] n1 = {"Bea", "Welly", "Caiden"};
        return null;
    }

    public String arrayContent2()
    {
        String [] n2 = {"Bea", "Welly", "Caiden"};
        return null;
    }

}
