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

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.udeve.service.CatService;
import com.udeve.utils.JsonResponse;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udeve.BaseApiController;

@RestController
@SaCheckLogin
@Api(tags = "cat管理")
public class CatController extends BaseApiController {

    @Autowired
    CatService catService;

    @GetMapping(value = "/v6/cats/")
    public JsonResponse getCatList(){
        return catService.getCatList();
    }
}
