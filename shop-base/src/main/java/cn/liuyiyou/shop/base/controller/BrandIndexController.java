package cn.liuyiyou.shop.base.controller;

import cn.liuyiyou.shop.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/10/31
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
@Controller
public class BrandIndexController extends BaseController {

    @GetMapping("/brands")
    public String brands(){
        return "brands";
    }
}
