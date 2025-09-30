public class ToppingLocal {
    private int id;
    private ToppingCat topping;
    private double precioExtra;

    public ToppingLocal(int id, ToppingCat topping, double precioExtra){
        this.id = id;
        this.topping = topping;
        this.precioExtra = precioExtra;
    }

    // setters
    public void setTopping(ToppingCat topping){
        this.topping = topping;
    }

    public void setPrecioExtra(double precioExtra){
        this.precioExtra = precioExtra;
    }

    // getters
    public int getId(){
        return this.id;
    }

    public ToppingCat getTopping(){
        return this.topping;
    }

    public double getPrecioExtra(){
        return this.precioExtra;
    }
}
