package com.example.buy.user.model;

import com.example.buy.user.model.request.PostCreateUserReq;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 200)
    private String password;
    @Column(length = 30)
    private String name;
    @Column(length = 200, unique = true)
    private String image;

}
