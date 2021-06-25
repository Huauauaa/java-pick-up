package com.hua.work;

public class Account {
    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account setId(int id) {
        this.id = id;
        return this;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}