package com.example.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ltemController {
    // 1.repository 생성
    private final ItemRepository itemRepository;
    // 2.원하는 클래스에 repository 등록

    @Autowired
    public ltemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/list")
    String list(Model model){
        // 3. 입출력 사용
        List<Item> result = itemRepository.findAll();
        System.out.println(result);



        model.addAttribute("name","홍길동");
        return "list.html";
    }
}
