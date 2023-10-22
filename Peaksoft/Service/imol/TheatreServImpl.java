package Peaksoft.Service.imol;

import Peaksoft.Dao.TheatreDao;
import Peaksoft.Dao.impl.TheatreDaoImpl;
import Peaksoft.Models.Movie;
import Peaksoft.Models.Theatre;
import Peaksoft.Service.TheatreService;

import java.util.List;
import java.util.Map;

public class TheatreServImpl implements TheatreService {
    TheatreDao theatreDao = new TheatreDaoImpl();

    @Override
    public List<Map<Movie, List<Theatre>>> getAllMoviesByTime(int hour) {
        return theatreDao.getAllMoviesByTime(hour);
    }
}
