package com.fino.gdgoc_2_railway.domain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "강원대 컴공 재학중인 최태영은 집을 개가고 싶지만, 갈 수 없어 강연을 듣고 있다. 하지만, 그의 노트북엔 알 수 없는 정보가 보이는데...! 맞추면 100만원";
    }
}
