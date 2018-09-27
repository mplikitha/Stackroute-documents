package com.stackroute.moviecruiser.repository;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.stackroute.moviecruiser.domain.Movie;
import com.stackroute.moviecruiser.repositories.MovieRepository;

/**
 * class to test MovieRepository
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MovieRepositoryTest {
	/**    
	 * referencing MovieRepository object
	 */
	@Autowired
	private transient MovieRepository repo;
	public void setRepo(final MovieRepository repo) {
		this.repo = repo;
	}
	@Test
	public void testSaveMovie() throws Exception {
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		final Movie movie = repo.getOne(1);
		assertThat(movie.getId()).isEqualTo(1);
	}
	@Test
	public void testUpdateMovie() throws Exception {
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		final Movie movie = repo.getOne(1);
		assertEquals(movie.getName(), "POC");
		movie.setComments("hi");
		repo.save(movie);
		final Movie tempMovie = repo.getOne(1);
		assertEquals("hi", tempMovie.getComments());
	}
	@Test
	public void testDeleteMovie() throws Exception {
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		final Movie movie = repo.getOne(1);
		assertEquals(movie.getName(), "POC");
		repo.delete(movie);
		assertEquals(Optional.empty(), repo.findById(1));
	}
	@Test
	public void testGetMovie() throws Exception {
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		final Movie movie = repo.getOne(1);
		assertEquals(movie.getName(), "POC");
	}
	@Test
	public void testGetAllMovies() throws Exception {
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		repo.save(new Movie(2, "POC-1", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jh0n123"));
		final List<Movie> movies = repo.findAll();
		assertEquals(movies.get(0).getName(), "POC");
	}
	
   @Test
	public void testGetMyMovies() {
		
		repo.save(new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		repo.save(new Movie(2, "POC-1", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jh0n123"));
		repo.save(new Movie(3, "Superman", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		repo.save(new Movie(4, "Superman-1", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112,"Jhon123"));
		List<Movie> myMovies = repo.findByUserId("Jhon123");
		System.out.println("myMovies::"+ myMovies.get(0).getName());
		assertEquals("POC", myMovies.get(0).getName());
	
		
		
	}
	
}