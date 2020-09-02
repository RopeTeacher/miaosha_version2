package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @Author rope
 * @Date 2020/8/16 17:40
 * @Version 1.0
 */
public interface PromoService {
    //根据itemId获取即将进行的 或者 正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);


}
