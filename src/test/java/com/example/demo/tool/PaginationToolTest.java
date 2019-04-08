package com.example.demo.tool;

import org.junit.Test;

import java.util.Map;

public class PaginationToolTest {
    @Test
    public void pagination() throws Exception {
        PaginationTool paginationTool = new PaginationTool();
        Map<String, Object> map = paginationTool.pagination(2, 5, 31);
        System.out.println(map);
    }

}