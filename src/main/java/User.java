import Diet.DietaryRestriction;

public class User {
    private String name;
    private String address;
    private String county;
    private DietaryRestriction dietaryRestriction;

    public User(String name, String address, String county, DietaryRestriction dietaryRestriction) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public DietaryRestriction getDietaryRestriction() {
        return dietaryRestriction;
    }

    public void setDietaryRestriction(DietaryRestriction dietaryRestriction) {
        this.dietaryRestriction = dietaryRestriction;
    }
}
