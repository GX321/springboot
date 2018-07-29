package com.springboot.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dalao {
    @Value("${dalao.name}")
    private String name;
    @Value("${dalao.height}")
    private int heigth;
    private String desc;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeigth() {
        return heigth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "Dalao [name=" + name + ", heigth=" + heigth + ", desc=" + desc + "]";
    }
    
    
    
}
