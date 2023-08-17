package com.example.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String comment; // 본문
    private String title; // 제목
    private String hashtag; // 해시태그
    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private String modifiedAt; // 수정자
    private LocalDateTime modifiedBy; // 수정일시
}
