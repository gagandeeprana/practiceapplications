package com.cloudsmartz.users.dao;

import com.cloudsmartz.users.model.UserAttempts;

public interface UserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);

	UserAttempts getUserAttempts(String username);
}
