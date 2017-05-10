public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _name;
    private int _priceCode;

    public Movie(String name, int priceCode) {
        _name = name;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getName(){
        return _name;
    }

    double getCharge(Rental rental) {
        double result = 0;
        switch (rental.getMovie().getPriceCode()) {
            case REGULAR:
                result += 2;
                if (rental.getDaysRented() > 2)
                    result += (rental.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += rental.getDaysRented() * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (rental.getDaysRented() > 3)
                    result += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
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