package com.example.beans.dto2;

import com.example.beans.dto.Turtle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bear {

    @Lazy
    @Autowired
    private Turtle turtle;

    //이런 상황이 생기게끔 설계를 하면 안돼요.

}
