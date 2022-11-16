package com.yapp.yapp.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "contestants")
@Table(name = "contestants")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contestants {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Date date;
    private String job;
    private String gender;
    private String country;
    private String yn;
    private String yu;
    private String yc;
    private Long ysv;
    private Long yvv;
    private boolean checkeda;
    private boolean checkedb;
    private boolean checkedc;
}
