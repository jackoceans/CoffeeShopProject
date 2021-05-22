public interface ICustomerCheckService {
    default boolean CustomerCheck(ICustomer customer) {
        return false;
    }

}