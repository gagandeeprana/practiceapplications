package com.cloudsmartz.users.dao;

import org.springframework.stereotype.Repository;

import com.cloudsmartz.users.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);

	UserAttempts getUserAttempts(String username);
}
