package top.chengdonglu.mall210.wx.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import top.chengdonglu.mall210.core.util.ResponseUtil;
import top.chengdonglu.mall210.core.validator.Order;
import top.chengdonglu.mall210.core.validator.Sort;
import top.chengdonglu.mall210.db.domain.LitemallIssue;
import top.chengdonglu.mall210.db.service.LitemallIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wx/issue")
@Validated
public class WxIssueController {
    private final Log logger = LogFactory.getLog(WxIssueController.class);

    @Autowired
    private LitemallIssueService issueService;

    /**
     * 帮助中心
     */
    @GetMapping("/list")
    public Object list(String question,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer size,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<LitemallIssue> issueList = issueService.querySelective(question, page, size, sort, order);
        return ResponseUtil.okList(issueList);
    }

}
