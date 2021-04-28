package models;

import com.github.javafaker.Faker;

public class ContactFactory {

    public static Contact.ContactBuilder get() {
        Faker random = Faker.instance();
        Contact.ContactBuilder contact = Contact.builder()
                .mailingStreet(random.lordOfTheRings().location())
                .assistant(random.lordOfTheRings().character());
        return contact;

    }
}
