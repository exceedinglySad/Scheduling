package com.defs.dao;

import com.defs.domain.Result;
import com.defs.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-04 21:31
 */
public interface ResultDao {
    // 删除全部的数据
    int deleteAllData();

    // 重新构建排班结果数据
    int buildResult(@Param("results") List<Result> results);

    // 获取排班后结果数据
    List<ResultVO> getResult();
}
