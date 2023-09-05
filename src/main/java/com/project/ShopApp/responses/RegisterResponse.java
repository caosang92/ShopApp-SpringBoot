package com.project.ShopApp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.ShopApp.Models.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("user")
    private User user;
}