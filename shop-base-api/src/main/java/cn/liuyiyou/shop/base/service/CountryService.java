package cn.liuyiyou.shop.base.service;

import cn.liuyiyou.shop.base.entity.Country;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/11/2
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
public interface CountryService {

    Country  getCountryById(String countryId);

}