package com.example.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor // 이게 자동으로 생성자를 만들어줌
public class ltemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("name","홍길동");
        return "list.html";
    }
}
