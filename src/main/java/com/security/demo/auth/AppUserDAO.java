package com.security.demo.auth;

import java.util.Optional;

public interface  AppUserDAO {
    Optional<AppUser> selectApplicationUserByUsername(String username);
}
