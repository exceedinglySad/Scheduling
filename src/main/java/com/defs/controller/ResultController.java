package com.defs.controller;

import com.defs.service.ResultService;
import com.defs.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-05 20:02
 */
@Controller
@RequestMapping("result")
public class ResultController {

    @Autowired
    @Qualifier("resultService")
    private ResultService resultService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("build")
    public String buildResult(Model model) {
        List<ResultVO> list = resultService.buildResult();
        model.addAttribute("list", list);
        return "result/allResults";
    }

    @RequestMapping("allResults")
    public String getResult(Model model){
        List<ResultVO> list = resultService.getResult();
        model.addAttribute("list", list);
        return "result/allResults";
    }
}
