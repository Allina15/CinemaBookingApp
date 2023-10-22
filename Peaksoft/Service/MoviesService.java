package Peaksoft.Service;
import Peaksoft.Models.Movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface MoviesService {
    String createMovie(String movies, List<String> columns);

    String saveMovie(Movie movie);

    Movie findById(long id);
    List<Movie> searchByName(String title);
    List<Movie> sortByDuration(String ascOrDesc);
    List<Movie> getMoviesByTheaterIdAndStartTime(Long theaterId, LocalDateTime startTime);
}
