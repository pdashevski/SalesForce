package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//POJO
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Contact {
    String lastName;
    String salutation;
    String title;
    String phone;
    String email;
    String accountName;
    String mailingStreet;
    String otherStreet;
    String mailingCity;
    String postalCode;
    String mailingCountry;
    String fax;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String leadSource;
    String description;
    String mobile;
}
