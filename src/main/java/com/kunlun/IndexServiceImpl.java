package com.kunlun;

import com.kunlun.entity.Seller;
import com.kunlun.result.BaseResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/13.
 */
@Service
public class IndexServiceImpl implements IndexService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexServiceImpl.class);

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public BaseResult hello() {
        LOGGER.info("Service B  接收到请求");
        return BaseResult.success("Server B 返回信息");
    }

    public BaseResult fallback() {
        return BaseResult.error("ERROR","Order Server2 Down");
    }
}
