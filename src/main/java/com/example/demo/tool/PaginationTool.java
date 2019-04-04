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

    public Map pagination(int page, int pageSize, int count) {
        Map<String,Object> map = new HashMap();
        logger.info("page=" + page, ",pageSize=" + pageSize + ",count=" + count);
        int totalPages = count % pageSize > 0 ? count / pageSize + 1 : count / pageSize;
        logger.info("totalPages=" + totalPages);
        map.put("totalPages",totalPages);




        return null;
    }

}
