package com.kunlun;

import com.kunlun.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/13.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/hello")
    public BaseResult hello(){
        return indexService.hello();
    }
}
