package spotify.premium;

import java.util.Objects;

public class Subscriber{
    private String lastName;
    private String firstName;
    private String emailAddress;
    private CreditCard creditCard;
    private Plans plans;
    private String password;

    public Subscriber() {
    }

    public Subscriber(String lastName, String firstName, String emailAddress,
                  CreditCard creditCard, Plans plans, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.creditCard = creditCard;
        this.plans = plans;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Plans getPlans() {
        return plans;
    }

    public void setPlans(Plans plans) {
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "From class Subscriber {" +
                " the first name is '" + firstName + '\'' +
                ", the last name is '" + lastName + '\'' +
                ", the email address is '" + emailAddress + '\'' +
                ", the password is " + password + '\'' +
                ", the credit card is " + creditCard.toString() +
                ", the choosen plan is " + plans.toString() +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber)) return false;
        Subscriber Subscriber = (Subscriber) o;
        return Objects.equals(getFirstName(), Subscriber.getFirstName()) &&
                Objects.equals(getLastName(), Subscriber.getLastName()) &&
                Objects.equals(getEmailAddress(), Subscriber.getEmailAddress()) &&
                Objects.equals(getPassword(), Subscriber.getPassword()) &&
                Objects.equals(getCreditCard(), Subscriber.getCreditCard()) &&
                Objects.equals(getPlans(), Subscriber.getPlans());
    }

//    public Subscriber(Subscriber SubscriberData) {
//        this.firstName = SubscriberData.firstName;
//        this.lastName = SubscriberData.lastName;
//        this.emailAddress = SubscriberData.emailAddress;
//        this.password = SubscriberData.password;
//        this.creditCard = new CreditCard(SubscriberData.creditCard);
//        this.plans = new Plans(SubscriberData.plans);
//    }

}
