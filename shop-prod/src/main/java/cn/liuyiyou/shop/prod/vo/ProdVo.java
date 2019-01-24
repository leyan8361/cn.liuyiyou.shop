package cn.liuyiyou.shop.prod.vo;

import lombok.Data;

import java.util.List;

/**
 * @author: liuyiyou@yanglaoban.com
 * @date: 2018/10/31
 * @version: V1.0
 * @Copyright: 2018 yanglaoban.com Inc. All rights reserved.
 */
@Data
public class ProdVo {
    private Long prodId;
    private String prodName;
    private Integer brandId;
    private String brandName;
    private Integer cataId;
    private String country;
    private List<ProdSkuVo> prodSkus;

}
