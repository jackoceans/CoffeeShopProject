public class Main {

    public static void main(String[] args) {


        ICustomer customer = new Customer("HASAN", "KARACAKAYA", "33520240694", 1991);
        CustomerManager Starbucks = new StarbucksCustomerManager(new MernisServiceAdapter("33520240694","HASAN BURAK","KARACAKAYA",1991));
        Starbucks.SaveToDatabase(customer);




    }

}
