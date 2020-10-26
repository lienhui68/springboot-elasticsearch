package com.eh.springbootelasticsearch.bean;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
    /**
     * spring-data-es遵从jpa规范，直接编写符合规定的方法名即可
     * 这里会根据名称进行匹配查找
     * @param bookName
     * @return
     */
    List<Book> findByNameLike(String bookName);
}
