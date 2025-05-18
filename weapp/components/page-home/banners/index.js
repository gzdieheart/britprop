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
// components/pagemaker/banners/index.js
const link = require("../link")

Component({
    /**
     * 组件的属性列表
     */
    properties: {
    },



    observers: {

    },


    /**
     * 组件的初始数据
     */
    data: {
        items:[
            {
                "link": {
                    "path": "",
                    "cat": "no",
                    "appid": "",
                    "function": "",
                    "opentype": "",
                    "url": "",
                    "apppath": ""
                },
                "title": "图片1",
                //"url": "https://tcdn.udeve.net/fang2021/4bbe636b-e0e8-4580-8bb0-66bbf61f11bd.png"
                "url": "http://127.0.0.1:8080/icon/banner.jpg"
            }
        ]
    },

    /**
     * 组件的方法列表
     */
    methods: {
        goto: function (e) {
            var index = e.currentTarget.dataset.index
            var block = this.data.config.items[index]
            link.clickHandle(block.link)
        },
    }
})
