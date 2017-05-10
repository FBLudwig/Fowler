import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    Movie movie = new Movie("Test", 0);
    Rental rental = new Rental(movie, 7);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(rental.getDaysRented(), 7);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(rental.getMovie(), movie);
    }

}