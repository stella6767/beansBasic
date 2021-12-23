package com.example.beans.dto;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Slf4j
//@Component//이름 기본전략은싱글톤.
public class Dog implements InitializingBean, DisposableBean {

    //bean의 생명주기에 대해서 알아볼게요.


//    @Autowired
//    private Cat cat; //이 bean을 찾을 수 없음.

    public String name;

    public Dog() {
        log.info(this.toString() + " 등록!"); //1
    }

    @PostConstruct
    public void start(){
        log.info("postConstrut");//2
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("의존관계 주입이 끝나면 실행");//3
    }


    private void init() {

        log.info("init");//4
    }

    @PreDestroy
    public void destory(){

        log.info("preDestory");//5
    }


    @Override
    public void destroy() throws Exception {

        log.info("어플리케이션이 종료되면서 빈들이 소멸할 때 실행");//6
    }


    private void close() {
        log.info("close"); //7
    }


    public void bark(){
        log.info("멍멍");
    }




    //class를 하나 만들었죠. 여기서 ioc 개념에 대해서 진짜 초간단하게 알아볼게요.
    //제어의 역전을 뜻하는 거죠.
    //이제는 bean들을 등록하는 다양한 방법들에 대해서 알아볼게요.

}
