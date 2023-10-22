package Peaksoft.Service.imol;

import Peaksoft.Dao.BookingDao;
import Peaksoft.Dao.impl.BookingDaoImpl;
import Peaksoft.Models.Booking;
import Peaksoft.Service.BookingService;

import java.util.List;

public class BookingServImpl implements BookingService {
    BookingDao bookingDao = new BookingDaoImpl();
    @Override
    public String save(Booking booking) {
        return bookingDao.save(booking);
    }

    @Override
    public Booking findById(int id) {
        return bookingDao.findById(id);
    }

    @Override
    public String delete(int id) {
        return bookingDao.delete(id);
    }

    @Override
    public void getAllBookings() {
    bookingDao.getAllBookings();
    }

    @Override
    public List<Booking> getBookingByUserId(int userId) {
        return bookingDao.getBookingByUserId(userId);
    }
}
