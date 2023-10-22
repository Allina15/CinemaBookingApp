package Peaksoft.Service;

import Peaksoft.Models.Movie;
import Peaksoft.Models.ShowTime;
import Peaksoft.Models.Theatre;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ShowTimeService {
    String saveShow(ShowTime showTime);
    ShowTime findById(Long id);
    String assign(Long showTime_id, Long movie_id, Long theatre_id);
    List<ShowTime> getAll();
    String deleteShowTimeByStartAndEndTime(Time startTime, Time endTime);
    List<Map<Theatre, List<Movie>>> getMoviesGroupByTheater();
}
