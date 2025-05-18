/**
* +----------------------------------------------------------------------
* | 友得云客
* +----------------------------------------------------------------------
* | Copyright (c) 2024-2027
* +----------------------------------------------------------------------
* | Licensed 友得云客不是自由软件 未经允许不可移除相关版权
* +----------------------------------------------------------------------
* | Author: www.youdeyunke.com
* +----------------------------------------------------------------------
*/
function throttle (fn, delay) {
    // 记录上一次函数触发的时间
    if (delay == null || delay == undefined) {
        delay = 1500
    }
    var lastTime = 0;
    return function () {
        // 记录当前函数触发的时间
        var nowTime = Date.now();
        if (nowTime - lastTime > delay) {
            fn.apply(this, arguments);
            // 同步时间
            lastTime = nowTime;
        }
    }
}


module.exports = {

    throttle: throttle,
}