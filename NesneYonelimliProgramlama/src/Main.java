public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Referans tipleri anlamak:

        //value type variables
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1=sayi2;

        sayi2 = 100;

        System.out.println(sayi1);

        //reference type variables
        int [] sayilar1 = new int [] {1, 2, 3};
        int [] sayilar2 = new int [] {10, 20, 30};
        sayilar1=sayilar2;

        sayilar2[0] = 1000;

        System.out.println(sayilar1[0]);

        //Class Kavramının Oturtulması

        CreditManager creditManager = new CreditManager();
        creditManager.add();
        creditManager.calculate();

        Customer customer = new Customer();
        customer.id=1;
//        customer.name = "Aybike";
//        customer.lastName= "Kalkay";
//        customer.nationalIdentity = "123456";
        String city = "Ankara";


//        CustomerManager customerManager = new CustomerManager();
//        customerManager.Save(1,"Aybike", "Kalkay", "123456" );

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.name = "Aybike";
        individualCustomer.lastName = "Kalkay";
        individualCustomer.id = 1;
        individualCustomer.sehir = "Ankara";
        individualCustomer.nationalIdentity = "123456";

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.id = 2;
        corporateCustomer.companyName = "Monster";
        corporateCustomer.sehir = "İstanbul";
        corporateCustomer.taxNumber = "0001122";

//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        CustomerManager customerManager1 = new CustomerManager(new CorporateCustomer());
//
//        Customer customer1 = new Customer();
//        Customer customer2 = new CorporateCustomer();
//        Customer customer3 = new IndividualCustomer();

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();

    }
}