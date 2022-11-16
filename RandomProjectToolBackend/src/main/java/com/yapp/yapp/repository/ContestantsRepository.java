package com.yapp.yapp.repository;

import com.yapp.yapp.model.Contestants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import javax.transaction.Transactional;

import java.util.List;
@Transactional
public interface ContestantsRepository  extends JpaRepository<Contestants,Long>{

       @Query(value = "SELECT contestants FROM contestants.contestants where yc= :yc and date between date= :date and date= :date2 and ysv= :ysv between ysv= :ysv2 " +
               " ORDER BY RAND() LIMIT 1  ",nativeQuery = true)
    List<Contestants> findByYcBetweenAndDateAndYsvBetween(String yc,long date,long date2 ,long ysv,long ysv2 );


    List <Contestants> findByYsvBetween( Long yt,Long yt2);


}
