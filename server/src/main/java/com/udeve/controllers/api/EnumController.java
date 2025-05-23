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


import com.udeve.entity.MyEnumeration;
import com.udeve.repository.MyEnumerationRepository;
import com.udeve.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.udeve.BaseApiController;

import java.util.List;

@RestController
public class EnumController extends BaseApiController {
    @Autowired
    MyEnumerationRepository enumRepository;

    @GetMapping(value = "/v6/enum")
    public JsonResponse Index(@RequestParam String cat) {
        List<MyEnumeration> data =  enumRepository.findByCatAndIsDeleteFalseOrderByNumberDesc(cat);
        return JsonResponse.ok(data);
    }

}
