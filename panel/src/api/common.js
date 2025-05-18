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
import request from '@/utils/request'


export function getCatList (params) {
    return request({
        url: '/v6/cats/',
        method: 'get',
        params
    })
}

export function getFitmentList (params) {
    return request({
        url: '/v6/fitments/',
        method: 'get',
        params
    })
}

