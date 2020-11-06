package com.defs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fuyongping
 * @date 2020-11-04 20:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable{
    private Integer id;
    private String name;
    // 时间段
    private String block;
    // 每个班次需要的人数
    private Integer nums;
    // 每次排班的间隔
    private Integer interval;
}
