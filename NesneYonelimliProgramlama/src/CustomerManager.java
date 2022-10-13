public class CustomerManager {

    private Customer _customer;
//    private IndividualCustomer _individualCustomer;
//    private CorporateCustomer _corporateCustomer;

    ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer ;
//        _individualCustomer = customer;
//        _corporateCustomer = customer;
        _creditManager = creditManager;
//
    }

//    Method parametresinde IndividualCustomer ve CorporateCustomer sınıfları oluşturulduktan sonra inheritance yapmamıza rağmen bir hata meydana geldi.
//    Bu sorun Interface'ler aracılığıyla çözülecektir.
    public void save() {
        System.out.println("Müşteri kaydedildi."); //+ _customer.name + " " + _customer.lastName);
    }

    public void delete() {
        System.out.println("Müşteri silindi."); //+ _customer.name + " " + _customer.lastName);
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi.");

    }
}
