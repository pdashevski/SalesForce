package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    String accountName;
    String parentAccount;
    String phone;
    String fax;
    String website;
    String type;
    String industry;
    String employees;
    String annualRevenue;
    String description;
    String billingStreet;
    String billingCity;
    String billingState;
    String billingZip;
    String billingCountry;
    String shippingStreet;
    String shippingCity;
    String shippingState;
    String shippingZip;
    String shippingCountry;
}
