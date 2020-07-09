package top.chengdonglu.mall210.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import top.chengdonglu.mall210.core.util.ResponseUtil;
import top.chengdonglu.mall210.db.service.LitemallGoodsProductService;
import top.chengdonglu.mall210.db.service.LitemallGoodsService;
import top.chengdonglu.mall210.db.service.LitemallOrderService;
import top.chengdonglu.mall210.db.service.LitemallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/dashboard")
@Validated
public class AdminDashbordController {
    private final Log logger = LogFactory.getLog(AdminDashbordController.class);

    @Autowired
    private LitemallUserService userService;
    @Autowired
    private LitemallGoodsService goodsService;
    @Autowired
    private LitemallGoodsProductService productService;
    @Autowired
    private LitemallOrderService orderService;

    @GetMapping("")
    public Object info() {
        int userTotal = userService.count();
        int goodsTotal = goodsService.count();
        int productTotal = productService.count();
        int orderTotal = orderService.count();
        Map<String, Integer> data = new HashMap<>();
        data.put("userTotal", userTotal);
        data.put("goodsTotal", goodsTotal);
        data.put("productTotal", productTotal);
        data.put("orderTotal", orderTotal);

        return ResponseUtil.ok(data);
    }

}
