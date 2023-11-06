package com.example.demo1.common;

import com.example.demo1.utils.StringUtils;
import lombok.Data;

/**
 * 分页请求参数
 */
@Data
public class PageDomain {
    /**
     * 当前分页索引
     */
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    private Integer pageSize;

    /**
     * 排序列
     */
    private String orderByColumn;

    /**
     * 排序的方向desc或者asc 默认asc
     */
    private String isAsc = "asc";

    /**
     * 分页数据合理化
     */
    private Boolean reasonable = true;

    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }

    public Boolean getReasonable() {
        if (reasonable == null) {
            return Boolean.TRUE;
        }
        return reasonable;
    }
}
