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

export function getBookingLogList (params) {
    return request({
        url: '/admin6/booking_logs',
        method: 'get',
        params
    })
}
export function deleteBookingLog (id) {
    return request({
        url: '/admin6/booking_logs/' + id,
        method: 'DELETE',
    })
}

export function exportBookingLogs (data) {
    return request({
        url: '/admin6/booking_logs/export',
        method: 'post',
        responseType: 'blob',
        data: data
    })
}

export function getBookingConfigs(id){
  return request({
    url: '/admin6/booking_configs/'+id,
    method: 'get'
  })
}

export function updateBookingConfigs(data){
  return request({
    url: '/admin6/booking_configs/'+data.post_id,
    method: 'PATCH',
    data: data.booking_configs
  })
}
