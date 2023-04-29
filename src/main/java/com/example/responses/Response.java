package com.example.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Response {
    private int code;
    private String message;
}
