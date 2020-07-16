package top.chengdonglu.mall210.db.dao;

import java.util.List;
import java.util.Map;

public interface StatMapper {
    List<Map> statUser();

    List<Map> statOrder();

    List<Map> statGoods();
}