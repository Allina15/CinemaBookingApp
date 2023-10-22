package Peaksoft.Service.imol;

import Peaksoft.Dao.MovieDao;
import Peaksoft.Dao.ShowTimeDao;
import Peaksoft.Dao.TheatreDao;
import Peaksoft.Dao.impl.MovieDaoImpl;
import Peaksoft.Dao.impl.ShowTimeDaoImpl;
import Peaksoft.Dao.impl.TheatreDaoImpl;
import Peaksoft.Models.Movie;
import Peaksoft.Models.ShowTime;
import Peaksoft.Models.Theatre;
import Peaksoft.Service.ShowTimeService;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ShowTimeServiceimpl implements ShowTimeService {
    ShowTimeDao showTimeDao = new ShowTimeDaoImpl();
    MovieDao movieDao = new MovieDaoImpl();
    TheatreDao theatreDao = new TheatreDaoImpl();
    @Override
    public String saveShow(ShowTime showTime) {
        return showTimeDao.saveShow(showTime);

    }

    @Override
    public ShowTime findById(Long id) {
        return showTimeDao.find(id);
    }

    @Override
    public String assign(Long showTime_id, Long movie_id, Long theatre_id) {
        ShowTime showTime = findById(showTime_id);
        Movie movie = movieDao.findById(movie_id);
        Theatre theatre = theatreDao.findById(theatre_id);
        showTime.setMovie_id(movie.getId());
        showTime.setTheatre_id(theatre.getId());
        showTimeDao.assign(showTime);
        return "success";
    }

    @Override
    public List<ShowTime> getAll() {
        return showTimeDao.getAll();
    }

    @Override
    public String deleteShowTimeByStartAndEndTime(Time startTime, Time endTime) {
        return showTimeDao.deleteShowTimeByStartAndEndTime(startTime,endTime);
    }

    @Override
    public List<Map<Theatre, List<Movie>>> getMoviesGroupByTheater() {
        return showTimeDao.getMoviesGroupByTheater();
    }
}
