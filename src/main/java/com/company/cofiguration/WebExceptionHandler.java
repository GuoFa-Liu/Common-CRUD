package com.company.cofiguration;

import com.company.common.R;
import com.company.common.ServerException;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author guofa.liu@kingtroldata.com
 * @description
 * @create 2018/11/17 14:09
 */

@Slf4j
@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {


    @ExceptionHandler(ServerException.class)
    public R.ResponseData serverException(ServerException e) {
        e.printStackTrace();
        log.error(e.getMessage(), e);
        return R.fail(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R.ResponseData exception(Exception e) {
        e.printStackTrace();
        log.error("服务器异常", e);
        return R.fail("服务器异常");
    }
}
