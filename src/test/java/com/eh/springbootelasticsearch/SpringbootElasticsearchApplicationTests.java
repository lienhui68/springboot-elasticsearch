package com.eh.springbootelasticsearch;

import com.eh.springbootelasticsearch.bean.Book;
import com.eh.springbootelasticsearch.bean.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootElasticsearchApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
        Book book = new Book(1, "三国演义", "罗贯中");
        bookRepository.save(book);
    }

    /**
     * 运行结果：Book(id=1, name=三国演义, author=罗贯中)
     */
    @Test
    void test1() {
        Book book = bookRepository.findByNameLike("国").get(0);
        System.out.println(book);
    }

}
