public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _name;
    Price _price;

    public Movie(String name, int priceCode) {
        _name = name;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getName(){
        return _name;
    }

    int getFrequentRenterPoints(Rental rental) {
        if ((rental.getMovie().getPriceCode() == NEW_RELEASE) && rental.getDaysRented() > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }
}