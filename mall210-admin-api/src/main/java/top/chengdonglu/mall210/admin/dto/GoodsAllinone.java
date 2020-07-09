package top.chengdonglu.mall210.admin.dto;

import top.chengdonglu.mall210.db.domain.LitemallGoods;
import top.chengdonglu.mall210.db.domain.LitemallGoodsAttribute;
import top.chengdonglu.mall210.db.domain.LitemallGoodsProduct;
import top.chengdonglu.mall210.db.domain.LitemallGoodsSpecification;

public class GoodsAllinone {
    LitemallGoods goods;
    LitemallGoodsSpecification[] specifications;
    LitemallGoodsAttribute[] attributes;
    LitemallGoodsProduct[] products;

    public LitemallGoods getGoods() {
        return goods;
    }

    public void setGoods(LitemallGoods goods) {
        this.goods = goods;
    }

    public LitemallGoodsProduct[] getProducts() {
        return products;
    }

    public void setProducts(LitemallGoodsProduct[] products) {
        this.products = products;
    }

    public LitemallGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(LitemallGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public LitemallGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(LitemallGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
