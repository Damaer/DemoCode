package com.aphysia.transienttest;

import java.io.Serializable;
import java.util.ArrayList;

public class School implements Serializable {
    public String name;

    public School(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
