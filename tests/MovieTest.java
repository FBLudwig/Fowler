import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("Test", 5);

    @org.junit.Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 5);
    }

    @org.junit.Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(10);
        assertEquals(movie.getPriceCode(), 10);
    }

}