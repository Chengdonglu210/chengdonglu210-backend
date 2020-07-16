package top.chengdonglu.mall210.db.dao;

import org.apache.ibatis.annotations.Param;
import top.chengdonglu.mall210.db.domain.LitemallOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") LitemallOrder order);
}