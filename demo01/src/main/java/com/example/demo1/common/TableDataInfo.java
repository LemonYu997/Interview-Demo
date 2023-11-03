package com.example.demo1.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回数据
 * TODO 暂未实现分页
 */
@Data
@NoArgsConstructor
public class TableDataInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 列表数据
     */
    private List<T> rows;

    /**
     * 消息状态码
     */
    private int code;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 分页
     */
    public TableDataInfo(List<T> list, long total) {
        this.rows = list;
        this.total = total;
    }
}
