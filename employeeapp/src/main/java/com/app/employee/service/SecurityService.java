package com.app.employee.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
