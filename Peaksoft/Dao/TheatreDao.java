package Peaksoft.Dao;

import Peaksoft.Models.Movie;
import Peaksoft.Models.Theatre;

import java.util.List;
import java.util.Map;

public interface TheatreDao {
    Theatre findById(Long theatreId);
    List<Map<Movie, List<Theatre>>> getAllMoviesByTime(int hour);
}
