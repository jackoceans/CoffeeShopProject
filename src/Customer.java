    public class Customer implements ICustomer{
        private int id;
        private String firstName;
        private String lastName;
        private String idNumber;
        private int yearOfBirth;

        public Customer(String firstName, String lastName, String idNumber, int YearOfBirth) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setIdNumber(idNumber);
            this.setYearOfBirth(YearOfBirth);
        }
        @Override
        public String getFirstName() {
            return this.firstName;
        }
        @Override
        public long getIdNumber() {

            return Long.valueOf(this.idNumber);
        }
        @Override
        public int getId() {
            return this.id;
        }

        @Override
        public String getLastName() {
            return this.lastName;
        }
        @Override
        public int getYearOfBirth() {
            return this.yearOfBirth;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }
    }

