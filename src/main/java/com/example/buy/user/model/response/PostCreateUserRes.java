package com.example.buy.user.model.response;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostCreateUserRes {
    private Long id;
    private String email;
    private String name;
    private String image;
}
