package com.example.demo.tool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuwei
 * @DESC 分页的公共类
 * int page 当前页, int pageSize 页大小, int count 数据总条数
 */
public class PaginationTool {
    Logger logger = LoggerFactory.getLogger(PaginationTool.class);

    public Map pagination(int currentPage, int pageSize, int count) {
        Map<String, Object> map = new HashMap();
        int currentCount;//当前数,用于sql的limit
        //先计算出总页数
        logger.info("page=" + currentPage, ",pageSize=" + pageSize + ",count=" + count);
        int totalPages = count % pageSize > 0 ? count / pageSize + 1 : count / pageSize;
        logger.info("totalPages=" + totalPages);
        if (currentPage < 1) {
            currentPage = 1;
        } else if (currentPage > totalPages) {
            currentPage = totalPages;
        }
        map.put("totalPages", totalPages);//总页数
        currentCount = (currentPage - 1) * pageSize;
        map.put("currentCount", currentCount);//当前数
        return map;
    }

}
