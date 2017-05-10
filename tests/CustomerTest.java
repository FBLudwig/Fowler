import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Movie movie = new Movie("Test", 5);
    Rental rental = new Rental(movie, 7);
    Customer customer = new Customer("NewName");

    @Test
    public void addRental() throws Exception {
        customer.addRental(rental);
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), "NewName");
    }

    @Test
    public void statement1() throws Exception {
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);

        String statement = "Rental Record for joe\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t10\t30.0\n" +
                "\tmovie2\t\t5\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points";
        assertEquals(c1.statement(), statement);
    }

    @Test
    public void statement2() throws Exception {
        Movie m1 = new Movie("movie1", 0);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 300);
        Rental r2 = new Rental(m2, 1);
        Customer c1 = new Customer("Adam");
        c1.addRental(r1);   c1.addRental(r2);

        String statement = "Rental Record for Adam\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t300\t449.0\n" +
                "\tmovie2\t\t1\t1.5\n" +
                "Amount owed is 450.5\n" +
                "You earned 2 frequent renter points";
        assertEquals(c1.statement(), statement);
    }

    @Test
    public void emptyStatement() throws Exception {
        Customer c1 = new Customer("Mike");

        String statement = "Rental Record for Mike\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";
        assertEquals(c1.statement(), statement);
    }

}