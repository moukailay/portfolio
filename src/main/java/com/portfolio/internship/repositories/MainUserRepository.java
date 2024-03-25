package com.portfolio.internship.repositories;

import com.portfolio.internship.models.MainUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MainUserRepository extends JpaRepository<MainUser, Long> {

}
