package CoLeslie;

public class Fish extends Animal implements Pet {

    private String name ="Snape";
    //Constructor
    public Fish()
    {
        super   (0);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat()
    {
        System.out.println("El pez  "+ name +" come peces");
    }

    @Override
    public void walk()
    {
        System.out.println("Recuerda que "+ name +" no caminan porque no tienen patas");
    }
@Override
    public void play ()
    {
        System.out.println(name + " juega a pescar");
    }



}
