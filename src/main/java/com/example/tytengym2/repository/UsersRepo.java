package com.example.tytengym2.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.tytengym2.models.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long>
{
    @Query("select count(u) from Users u")
    public Long totalMembers();

    @Query("select u from Users u where u.joining_month = :month")
    public List<Users> joinMonth(@Param("month") String month);

    @Query("select u.userid from Users u where u.username = :name and u.email = :email")
    public Long findByEmail(@Param("name") String name, @Param("email") String email);

}
