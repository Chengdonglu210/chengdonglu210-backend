package top.chengdonglu.mall210.wx.service;

import top.chengdonglu.mall210.db.domain.LitemallUser;
import top.chengdonglu.mall210.db.service.LitemallUserService;
import top.chengdonglu.mall210.wx.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserInfoService {
    @Autowired
    private LitemallUserService userService;


    public UserInfo getInfo(Integer userId) {
        LitemallUser user = userService.findById(userId);
        Assert.state(user != null, "用户不存在");
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(user.getNickname());
        userInfo.setAvatarUrl(user.getAvatar());
        return userInfo;
    }
}
