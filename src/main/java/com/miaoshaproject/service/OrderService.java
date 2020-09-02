package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author rope
 * @Date 2020/8/4 15:08
 * @Version 1.0
 */
public interface OrderService {

    //1.通过前端url传递过来的秒杀活动id 然后下单接口内校验对应id是否属于对应商品且活动已开始（使用）
    //2.直接再下单接口内判断对应的商品是否存在秒杀活动 若存在进行中的则以秒杀价格下单
    OrderModel createOrder(Integer userId,Integer itemId,Integer amount,Integer promoId) throws BusinessException;



}
