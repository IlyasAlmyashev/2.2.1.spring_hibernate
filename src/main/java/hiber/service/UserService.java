package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    List<User> getUserByCarModelAndSeries(String model, int series);
}
