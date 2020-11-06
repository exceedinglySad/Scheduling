package com.defs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fuyongping
 * @date 2020-11-04 21:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer id;
    private Integer orderId;
    private Integer userId;
    private Integer days;
}
