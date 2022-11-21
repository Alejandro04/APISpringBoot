package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer priority;

    @Column(name="id_category")
    private Integer idCategory;

    @ManyToOne
    @JoinColumn(name="id_category", insertable = false, updatable = false)
    private CategoryModel category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public Integer getIdCategory() {
        return idCategory;
    }
    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
}
