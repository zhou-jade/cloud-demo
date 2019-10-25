package com.example.web;

import com.example.bean.Blog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlogController {

    @RequestMapping("/blog/{title}")
    public Blog  findByTitle(@PathVariable("title") String title){
        return new Blog(title,"伊藤润二");
    }

    @RequestMapping("/blog/findList")
    public List<Blog> findList(){
        List<Blog> list = new ArrayList<>();
        list.add(new Blog("博客1","作者1"));
        list.add(new Blog("博客2","作者2"));
        list.add(new Blog("博客3","作者3"));
        list.add(new Blog("博客4","作者4"));
        return list;
    }
}
