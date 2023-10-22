package Peaksoft.Service.imol;

import Peaksoft.Dao.MovieDao;
import Peaksoft.Dao.impl.MovieDaoImpl;
import Peaksoft.Models.Movie;
import Peaksoft.Service.MoviesService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class MovieServiceImpl implements MoviesService {
    MovieDao movieDao = new MovieDaoImpl();
    @Override
    public String createMovie(String table, List<String> columns) {
        movieDao.createTable(table,columns);
        return "succesfuly create table: "+table;
    }

    @Override
    public String saveMovie(Movie movie) {
        movieDao.saveMovies(movie);
        return "Successfully saved";
    }

    @Override
    public Movie findById(long id) {
        return movieDao.findById(id);
    }

    @Override
    public List<Movie> searchByName(String title) {
        return movieDao.searchByName(title);
    }

    @Override
    public List<Movie> sortByDuration(String ascOrDesc) {
        return movieDao.sortByDuration(ascOrDesc);
    }

    @Override
    public List<Movie> getMoviesByTheaterIdAndStartTime(Long theaterId, LocalDateTime startTime) {
        return movieDao.getMoviesByTheaterIdAndStartTime(theaterId,startTime);
    }
}
