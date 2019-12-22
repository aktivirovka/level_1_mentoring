/*Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Номер банковского счета.
Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится
в заданном интервале.*/

import java.util.List;

public class CreationStoreWithCustomers {
    public static void main(String[] args) {
        Store diodorovaStore = new Store("Diodora");

        Customer ivanova = new Customer("Ivanova", "Katerina", "Konstantinovna", "Belarus");
        ivanova.setCreditCard(123_458_151L);
        ivanova.setBankAccountNumber(11_111);
        diodorovaStore.addCustomerToCustomerList(ivanova);

        Customer petrova = new Customer("Petrova", "Nina", "Aleksandrovna", "Russia");
        petrova.setCreditCard(789_444_478L);
        petrova.setBankAccountNumber(22_222);
        diodorovaStore.addCustomerToCustomerList(petrova);

        Customer sidorov = new Customer("Sidorov", "Joe", "USA");
        sidorov.setCreditCard(555_212_564L);
        sidorov.setBankAccountNumber(33_333);
        diodorovaStore.addCustomerToCustomerList(sidorov);

        Customer kovalev = new Customer("Kovalev", "Ivan", "Germany");
        kovalev.setCreditCard(112_582_447L);
        diodorovaStore.addCustomerToCustomerList(kovalev);

        Customer balabanova = new Customer("Balabanova", "Elena", "Vasilevna", "Russia");
        balabanova.setCreditCard(458_002_004L);
        balabanova.setBankAccountNumber(55_555);
        diodorovaStore.addCustomerToCustomerList(balabanova);

        System.out.println("List of customers in alphabetical order: ");
        List<Customer> customersListInAlphabeticalOrder = diodorovaStore.getCustomersListInAlphabeticalOrder();
        for (Customer person : customersListInAlphabeticalOrder) {
            System.out.println(person);
        }

        List<Customer> customersAccordingToCreditCardNumber = diodorovaStore.getCustomersAccordingToCreditCardNumber(0, 200_000_000L);
        System.out.println("\nList of customers according to credit card number:");
        if (customersAccordingToCreditCardNumber.size() > 0) {
            for (Customer person : customersAccordingToCreditCardNumber) {
                System.out.println(person.getSurname() + " " + person.getName());
            }
        } else {
            System.out.println("There is no data satisfying the search");
        }
    }
}
