package CoLeslie;

public class Cat extends Animal implements Pet {

    //Crear variable que almacene el nombre
    String nombre = "Perseo";

    //Definir un constructor que tome un String como parámetro y especifique el nombre del gato.
    public Cat (String nombre) {
        super( 4);
        this.nombre = nombre;
    }


 public Cat()
 {
     this("");
 }

    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public void setName(String nombre) {
    this.nombre = nombre;
    }

    /*Implementar el motdo interfaz*/
  @Override
    public void play ()
  {
      System.out.println(nombre + " le gusta jugar con la bola de estambre");
  }

  //Implemetar el metodo comer

    @Override

    public void eat()
    {
        System.out.println(nombre + " come pescado" );
    }
@Override
    public void walk(){

}
}
