public class ToppingCat {
    private int id;
    private String nombre;

    public ToppingCat(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    // setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // getters
    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }
}
