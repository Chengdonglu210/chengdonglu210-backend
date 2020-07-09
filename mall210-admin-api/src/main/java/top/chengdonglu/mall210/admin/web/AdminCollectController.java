package top.chengdonglu.mall210.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import top.chengdonglu.mall210.admin.annotation.RequiresPermissionsDesc;
import top.chengdonglu.mall210.core.util.ResponseUtil;
import top.chengdonglu.mall210.core.validator.Order;
import top.chengdonglu.mall210.core.validator.Sort;
import top.chengdonglu.mall210.db.domain.LitemallCollect;
import top.chengdonglu.mall210.db.service.LitemallCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/collect")
@Validated
public class AdminCollectController {
    private final Log logger = LogFactory.getLog(AdminCollectController.class);

    @Autowired
    private LitemallCollectService collectService;


    @RequiresPermissions("admin:collect:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "用户收藏"}, button = "查询")
    @GetMapping("/list")
    public Object list(String userId, String valueId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<LitemallCollect> collectList = collectService.querySelective(userId, valueId, page, limit, sort, order);
        return ResponseUtil.okList(collectList);
    }
}
