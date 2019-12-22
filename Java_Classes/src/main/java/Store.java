import java.util.ArrayList;
import java.util.Comparator;

class Store {

    Store(String name) {
    }
    private ArrayList<Customer> customersList = new ArrayList<>();

    void addCustomerToCustomerList(Customer person) {
        customersList.add(person);

    }

    ArrayList<Customer> getCustomersListInAlphabeticalOrder() {
        ArrayList<Customer> list = new ArrayList<>(customersList);
        Comparator<Customer> comparator = (person1, person2) -> {
            String fullNameFirstPerson = person1.getSurname() + person1.getName() + person1.getMiddleName();
            String fullNameSecondPerson = person2.getSurname() + person2.getName() + person2.getMiddleName();
            return fullNameFirstPerson.compareToIgnoreCase(fullNameSecondPerson);
        };
        list.sort(comparator);
        return list;
    }

    ArrayList<Customer> getCustomersAccordingToCreditCardNumber(long initialNumber, long finaleNumber) {
        ArrayList<Customer> customersWithAppropriateCard = new ArrayList<>();
        for (Customer person : customersList) {
            if (person.getCreditCardNumber() >= initialNumber && person.getCreditCardNumber() <= finaleNumber) {
                customersWithAppropriateCard.add(person);
            }
        }
        return customersWithAppropriateCard;
    }
}



