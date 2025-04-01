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
import com.udeve.request.FeedbackCreateRequest;
import com.udeve.service.FeedbackService;
import com.udeve.utils.JsonResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController extends BaseApiController {

    @Autowired
    FeedbackService feedbackService;

    @Operation(summary = "小程序用户提交用户反馈")
    @PostMapping("/v6/feedback")
    public JsonResponse createFeedbackInfo(@RequestBody FeedbackCreateRequest createRequest){
        return feedbackService.weappCreateFeedbackInfo(createRequest);
    }
}
