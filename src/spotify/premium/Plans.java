package spotify.premium;

public class Plans {

    private String description;
    private float price;
    private int numberOfAccounts;
    private int numberOfDevices;

    public Plans() {
    }

    public Plans(String description, float price, int numberOfAccounts, int numberOfDevices) {
        this.description = description;
        this.price = price;
        this.numberOfAccounts = numberOfAccounts;
        this.numberOfDevices = numberOfDevices;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getnumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setnumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public int getnumberOfDevices() {
        return numberOfDevices;
    }

    public void setnumberOfDevices(int numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
    }
    
    public void setDetails(String description)
    {
        if (description.equals("Individual")) {
            price = (float)4.99;
            numberOfAccounts = 1;
            numberOfDevices = 2;
        } else if (description.equals("Duo")) {
            price = (float) 6.49;
            numberOfAccounts = 2;
            numberOfDevices = 4;
        } else if (description.equals("Family")) {
            price = (float) 7.99;
            numberOfAccounts = 6;
            numberOfDevices = 10;
        }  else if (description.equals("Student")) {
            price = (float) 2.49;
            numberOfAccounts = 1;
            numberOfDevices = 1;
            
        } else System.out.println("Selected plan is not available currently! We are sorry!");
    }

    @Override
    public String toString() {
        return "From class Plans {" +
                " the description is '" + description + '\'' +
                ", the price is '" + price +
                ", the number of accounts that the subscriber has is '" + numberOfAccounts +
                ", the number of devices that the subscriber has is '" + numberOfDevices +
                "} ";
    }

//    public Plans(Plans plans) {
//        this.description = plans.description;
//        this.price = plans.price;
//        this.numberOfAccounts = plans.numberOfAccounts;
//        this.numberOfDevices = plans.numberOfDevices;
//    }
}
