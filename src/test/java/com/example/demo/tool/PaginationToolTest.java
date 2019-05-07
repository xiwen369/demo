package com.example.demo.tool;

import org.junit.Test;

import java.util.Map;

public class PaginationToolTest {
    @Test
    public void pagination() throws Exception {
        Map<String, Object> map = PaginationTool.pagination(99, 5, 31);
        System.out.println(map);
    }

}