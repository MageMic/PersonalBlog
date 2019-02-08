package com.zjumic.PersonalBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String index(HttpServletRequest request) {
        request.setAttribute("title", "我的第一个web页面");
        request.setAttribute("desc", "欢迎进入Luis-web 系统");
        Author author = new Author();
        author.setAge(24);
        author.setEmail("1085143002@qq.com");
        author.setName("Luis");
        request.setAttribute("author", author);
        return "index";
    }

    class Author {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        private String email;
    }
}
