package com.app.employee.service;

import com.app.employee.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
