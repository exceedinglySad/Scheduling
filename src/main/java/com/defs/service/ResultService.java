package com.defs.service;

import com.defs.domain.Result;
import com.defs.vo.ResultVO;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-05 19:47
 */
public interface ResultService {

    // 重新构建排班结果数据
    List<ResultVO> buildResult();

    // 获取排班后结果数据
    List<ResultVO> getResult();
}
