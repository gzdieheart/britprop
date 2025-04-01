package com.udeve.controllers.api;
/**
 * +----------------------------------------------------------------------
 * | 友得云客
 * +----------------------------------------------------------------------
 * | Copyright (c) 2024~2027
 * +----------------------------------------------------------------------
 * | Licensed 友得云客不是自有软件 未经允许不可移除相关版权
 * +----------------------------------------------------------------------
 * | Author: www.youdeyunke.com
 * +----------------------------------------------------------------------
 */
import com.udeve.BaseApiController;
import com.udeve.service.JumpService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "生成跳转代码")
@Slf4j
public class JumpController extends BaseApiController {

    @Autowired
    JumpService jumpService;

    @Operation(summary = "生成js代码供web端使用")
    @GetMapping("v6/jump_js")
    public String genUrlScheme(){
        return jumpService.genUrlScheme();
    }
}
