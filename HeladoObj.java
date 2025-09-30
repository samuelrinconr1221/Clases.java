public class HeladoObj {
    private int id;
    private String sabor;
    private double precio;

    public HeladoObj(int id, String sabor, double precio){
        this.id = id;
        this.sabor = sabor;
        this.precio = precio;
    }

    // setters
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    // getters
    public int getId(){
        return this.id;
    }

    public String getSabor(){
        return this.sabor;
    }

    public double getPrecio(){
        return this.precio;
    }
}
