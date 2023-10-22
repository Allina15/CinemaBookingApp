package Peaksoft.Service;

import Peaksoft.Models.Movie;
import Peaksoft.Models.Theatre;

import java.util.List;
import java.util.Map;

public interface TheatreService {
    List<Map<Movie, List<Theatre>>> getAllMoviesByTime(int hour);
}
