import mernisReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

    public MernisServiceAdapter(String s, String hasan_burak, String karacakaya, int i) {

    }

    @Override
    public boolean CustomerCheck(ICustomer customer) {
        try {
            KPSPublicSoapProxy client = new KPSPublicSoapProxy();

            return client.TCKimlikNoDogrula(customer.getIdNumber(), customer.getFirstName(), customer.getLastName().toUpperCase(),
                    customer.getYearOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
