package com.blog.blogApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "blogUser")
@AllArgsConstructor
@NoArgsConstructor
public class blogEntity {

    @Id
    private long id;
}
