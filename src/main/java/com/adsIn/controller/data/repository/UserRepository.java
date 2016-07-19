package com.adsIn.controller.data.repository;

import java.util.Date;
import java.util.List;

import com.adsIn.controller.data.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	public User findByName(String name);

	@Query(value = "{'name': ?0}", count = true)
	public int findUser(String name);
}
