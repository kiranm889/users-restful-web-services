package com.learn.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class UserDaoService {
    //DataBase
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findByIds(int id){
        List<User> allUsersById = users.stream().filter(ids->ids.getId()==id).collect(Collectors.toList());
         return allUsersById.get(0);
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return  user;
    }

    public void deleteByUserId(int id){
        Predicate<? super User> predicate = user -> user.getId()==id;
        users.removeIf(predicate);
    }



}
