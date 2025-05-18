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

export function getEnumerationList (params) {
    return request({
        url: '/admin6/enumerations/',
        method: 'get',
        params
    })
}

export function updateEnumeration (data) {
    return request({
        url: '/admin6/enumerations/' + data.id,
        method: 'PATCH',
        data: data,
    })
}

export function createEnumeration (data) {

    return request({
        url: '/admin6/enumerations/',
        method: 'POST',
        data: data,
    })
}

export function deleteEnumeration (eid) {
    return request({
        url: '/admin6/enumerations/' + eid,
        method: 'DELETE',
    })
}