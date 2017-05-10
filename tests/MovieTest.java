import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("Test", 1);

    @org.junit.Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 1);
    }

    @org.junit.Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(2);
        assertEquals(movie.getPriceCode(), 2);
    }

}