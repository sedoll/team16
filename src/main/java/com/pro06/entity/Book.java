package com.pro06.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "book")
@ToString

public class Book extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;   // 교재 코드

    private String title; // 제목
    private String content; // 내용
    private String servecontent; // 요약 내용
    private BigDecimal price; // 가격
    private LocalDate publish; // 출간일
}
