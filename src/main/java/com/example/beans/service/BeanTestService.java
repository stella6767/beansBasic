package com.example.beans.service;





import com.example.beans.dto.Animal;
import com.example.beans.dto.Dog;
import com.example.beans.dto.MyObjectMapper;
import com.example.beans.dto.Snake;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


//@RequiredArgsConstructor
@Slf4j
@Service
public class BeanTestService {


    //1. 필드 주입, 스프링프레임워크의 도움을 받는 거기 때문에, DI 프레임워크가 없으면 아무것도 할 수 없어요. 테스트하기가 힘들어요.
    //@Autowired
    //private Dog dog;

    //2.수정자 주입 - 거의 안 씀. public으로 열어줘야 되는데, 누군가의 실수로 변할 수 있음.
//    @Autowired
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    //3. 생성자 주입
//    private final Dog dog; //불변성을 가질 수 있음. 순수한 자바 코드로 테스트 할 수 있어요.
//
//    //@Autowired
//    public BeanTestService(Dog dog) { //호출시점에서 딱 1번만 호출, 주입 데이터를 누락했을 때, 컴파일 시점부터 컴파일 오류가 나서, 디버깅하기 쉽죠.
//        this.dog = dog;
//    }



//    private final Dog dog;
//
//    //@Autowired
//    public BeanTestService(@Qualifier("mydog") Dog dog) {
//        this.dog = dog;
//    }


    //예를 들어서 어플리케이션 서버에 db가 두개 붙어있을 경우도 있어요.



    private final List<Animal> animalList;
    private final List<Dog> dogList;
    private final Map<String,Animal> animalMap;
    private final Map<String,Dog> dogMap;

    private final Snake snake;

    private final MyObjectMapper objectMapper;

    public BeanTestService(List<Animal> animalList, List<Dog> dogList, Map<String, Animal> animalMap, Map<String, Dog> dogMap, @Lazy Snake snake, MyObjectMapper objectMapper) {
        this.animalList = animalList;
        this.dogList = dogList;
        this.animalMap = animalMap;
        this.dogMap = dogMap;
        this.snake = snake;
        this.objectMapper = objectMapper;


        System.out.println(animalList);
        System.out.println(dogList);
        System.out.println(animalMap);
        System.out.println(dogMap);

        //objectMapper.coercionConfigFor()

//        System.out.println(dogMap.get("mydog").name);
//        System.out.println(dogMap.get("yourdog").name);
//        System.out.println(dogMap.get("dog").name);
//
//        //snake.bark();

    }


    //내일 알아보고, 그리고 이제 패키지 탐색


    //네이밍 충돌될때는 이렇게 @Qualifier 어노테이션을 사용해서 해결을 하시면 되고요. @Primary, //

    //private final Animal animal;
//

//    public BeanTestService(Snake snake) {
//
//        //this.animal = animal;
//
//        //log.info("dog? " + dog);
//        this.snake = snake;
//    }



////    //private final com.example.beans.dto.Dog originDog;
////
    public void diTest(){
        //log.info("di test" + dog.toString());

        //dog.bark();
        //animal.bark();
        //originDog.bark(); e


    }



}
