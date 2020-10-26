package com.eh.springbootelasticsearch.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "eh", shards = 5)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Integer id;
    private String name;
    private String author;
}
