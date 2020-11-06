package com.defs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fuyongping
 * @date 2020-11-04 21:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO {

    private Integer days;
    private String orderName;
    private String operator;
}
