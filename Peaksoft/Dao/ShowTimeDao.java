package Peaksoft.Dao;

import Peaksoft.Models.Movie;
import Peaksoft.Models.ShowTime;
import Peaksoft.Models.Theatre;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ShowTimeDao {
    String saveShow(ShowTime showTime);
    ShowTime find(Long id);
    void assign(ShowTime showTime);
    List<ShowTime> getAll();
    String deleteShowTimeByStartAndEndTime(Time startTime, Time endTime);
    List<Map<Theatre, List<Movie>>> getMoviesGroupByTheater();
}
