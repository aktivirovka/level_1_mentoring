public class Customer {
    static private int idGenerator = 0;
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private long creditCardNumber;
    private int bankAccountNumber;

    Customer(String surname, String name, String address) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.id = idGenerator++;
    }

    Customer(String surname, String name, String middleName, String address) {
        this(surname, name, address);
        this.middleName = middleName;
    }

    void setCreditCard(long number) {
        this.creditCardNumber = number;

    }

    void setBankAccountNumber(int number) {
        this.bankAccountNumber = number;

    }

    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }

    String getMiddleName() {
        return middleName;
    }

    String getAddress() {
        return address;
    }

    long getCreditCardNumber() {
        return creditCardNumber;
    }

    int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return String.format("ID:%d\t Surname: %-10s\t Name: %-8s\t Middle name: %-14s\t Address: %-7s\t Credit card number: %d\t Bank account number: %d\t",
                id, surname, name, middleName, address, creditCardNumber, bankAccountNumber);
    }


}


