package com.yr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void query() {
        String sql = "select * from mvc";
        RowMapper<User> row = new BeanPropertyRowMapper<User>(User.class);
        List<User> list = jdbcTemplate.query(sql,row);
        for (User user : list)
        {
            System.out.println(user.toString());
        }
    }
}