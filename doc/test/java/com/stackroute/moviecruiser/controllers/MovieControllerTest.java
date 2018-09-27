package com.stackroute.moviecruiser.controllers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.moviecruiser.domain.Movie;
import com.stackroute.moviecruiser.services.MovieService;

@RunWith(SpringRunner.class)
@WebMvcTest(MovieController.class)
public class MovieControllerTest {

	private MockMvc movieMockMvc;

	@MockBean
	private MovieService movieService;

	@InjectMocks
	private MovieController movieController;

	private Movie movie;
	static List<Movie> movies;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

		movie = new Movie(3706, "Batman Begins", "Very good action movie", "22/11/2015", null, 4.9, 33, "Jhon123");
		movieMockMvc = MockMvcBuilders.standaloneSetup(movieController).build();
		movies = new ArrayList<>();
		movie = new Movie(1, "POC", "good Movie", "www.abc.com", "2015-03-23", 45.5, 112, "Jhon123");
		movies.add(movie);
		movie = new Movie(2, "POC-2", "very good Movie", "www.cde.com", "2013-09-23", 65.5, 110, "Jhon123");
		movies.add(movie);
	}

	@Test
	public void testSaveNewMovie() throws Exception {
		when(movieService.saveMovie(movie)).thenReturn(true);
		movieMockMvc.perform(post("/api/movie").contentType(MediaType.APPLICATION_JSON).content(asJsonString(movie)))
				.andExpect(status().isCreated()).andDo(print());
		verify(movieService, times(1)).saveMovie(Mockito.any(Movie.class));
	}

	@Test
	public void testDeleteMovieById() throws Exception {

		when(movieService.deleteMovieById(1)).thenReturn(true);
		movieMockMvc.perform(delete("/api/movie/delete/{id}", 1)).andExpect(status().isOk());
		verify(movieService, times(1)).deleteMovieById(1);
		verifyNoMoreInteractions(movieService);

	}

	@Test
	public void testFetchMovieById() throws Exception {

		when(movieService.getMovieById(1)).thenReturn(movies.get(0));
		movieMockMvc.perform(get("/api/movie/get/{id}", 1)).andExpect(status().isOk());
		verify(movieService, times(1)).getMovieById(1);
		verifyNoMoreInteractions(movieService);
	}

	@Test
	public void testFetchAllMovies() throws Exception {
		when(movieService.getAllMovies()).thenReturn(null);
		movieMockMvc.perform(get("/api/movie")).andExpect(status().isOk());
		verify(movieService, times(1)).getAllMovies();
		verifyNoMoreInteractions(movieService);
	}

	@Test
	public void testGetMyMovies() throws Exception {
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhc2h1QGdtYWlsLmNvbSIsImlhdCI6MTUxMDgxNTczMX0.6a3aiWgY2BhfIU2ghwf89wqzjPVoBEfmTwUgT9LExnw";
		when(movieService.getMyMovies("ashu@gmail.com")).thenReturn(movies);
		movieMockMvc.perform(get("/api/movie/myMovies").header("authorization", "Bearer " + token)
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andDo(print());
		verify(movieService, times(1)).getMyMovies("ashu@gmail.com");
		verifyNoMoreInteractions(movieService);
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
