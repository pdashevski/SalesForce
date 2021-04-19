package models;

//POJO
public class Contact {
    String lastName;
    String firstName;
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
    String birthDate;
    String description;
    String mobile;

    public Contact(String lastName, String salutation, String title, String phone, String email, String accountName, String mailingStreet, String otherStreet, String mailingCity, String postalCode, String mailingCountry, String fax, String otherPhone, String asstPhone, String assistant, String department, String leadSource, String description, String mobile) {
        this.lastName = lastName;
        //this.firstName = firstName;
        this.salutation = salutation;
        this.title = title;
        this.phone = phone;
        this.email = email;
        this.accountName = accountName;
        this.mailingStreet = mailingStreet;
        this.otherStreet = otherStreet;
        this.mailingCity = mailingCity;
        this.postalCode = postalCode;
        this.mailingCountry = mailingCountry;
        this.fax = fax;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.leadSource = leadSource;
        //this.birthDate = birthDate;
        this.description = description;
        this.mobile = mobile;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
