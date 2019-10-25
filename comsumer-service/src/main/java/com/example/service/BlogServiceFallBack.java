package com.example.service;

import com.example.bean.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * BlogService的熔断降级处理类，用于处理BlogService由于访问服务失败导致的阻塞的降级方案
 */
@Service //feign的熔断器类需要交给ioc容器管理，因此需要添加注解
public class BlogServiceFallBack implements BlogService {
    @Override
    public Blog findByTitle(String title) {
        return new Blog("服务器挂了","");
    }

    @Override
    public List<Blog> findList() {
        return new ArrayList<>();
    }
}
