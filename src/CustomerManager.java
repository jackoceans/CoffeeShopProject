public class CustomerManager implements ICustomerService{

    @Override
    public void SaveToDatabase(ICustomer customer) {
        System.out.println(customer.getFirstName()+" Veri tabanına kayıt edildi.");

    }

}
