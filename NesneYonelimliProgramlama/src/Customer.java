public class Customer {

    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı.");
    }
    int id;
    String sehir;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}


