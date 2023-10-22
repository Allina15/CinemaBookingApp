package Peaksoft.Service.imol;

import Peaksoft.Dao.UserDao;
import Peaksoft.Dao.impl.UserDaoImpl;
import Peaksoft.Service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public Boolean existByEmail(String email) {
        return userDao.existByEmail(email);
    }
}
