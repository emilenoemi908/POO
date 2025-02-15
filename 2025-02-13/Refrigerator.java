class Refrigerator extends Product {

    int size;

    public Refrigerator(String brand, double price, int size){
        super(brand, price);
        this.size = size;

    }

    public int getSize() {
        return size;
    }
}
