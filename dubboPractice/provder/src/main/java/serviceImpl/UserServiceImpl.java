package serviceImpl;

import bean.User;
import service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserServiceImpl implements UserService {
    //@Override
    public List<User> getUserByName(String name) {
        User u1 = new User(1, name, "B");
        User u2 = new User(2, name, "A");
        return Arrays.asList(u1, u2);
        //return Stream.of(u1, u2).collect(Collectors.toList());
    }

}
