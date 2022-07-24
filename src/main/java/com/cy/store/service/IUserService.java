package com.cy.store.service;

import com.cy.store.entity.User;

/** 处理用户数据的业务层接口 */
public interface IUserService {
    /**
     * 用户注册
     * @param user 用户数据
     */
    void reg(User user);

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 登录成功的用户数据
     */
    User login(String username, String password);

    /**
     * 修改密码
     * @param uid 当前登录的用户id
     * @param username 用户名
     * @param oldPassword 原密码
     * @param newPassword 新密码
     */
    public void changePassword(Integer uid, String username, String oldPassword, String newPassword);

    /**
     * 获取当前登录的用户的信息
     * @param uid 当前登录的用户的id
     * @return 当前登录的用户的信息
     */
    User getByUid(Integer uid);

    /**
     * 修改用户资料
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @param user 用户的新的数据
     */
    void changeInfo(Integer uid, String username, User user);

    /**
     * 修改用户头像
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @param avatar 用户的新头像的路径
     */
    void changeAvatar(Integer uid, String username, String avatar);
}


/*<div class="col-md-6">
<div class="panel panel-default">
    <div class="panel-heading">
        <p class="panel-title">新到好货</p>
    </div>
    <div class="panel-body panel-item">
        <div class="col-md-12">
            <div class="col-md-7 text-row-2"><a href="product.html">齐心（COMIX）C5902 A5优品商务笔记本子记事本日记本122张</a></div>
            <div class="col-md-2">¥18</div>
            <div class="col-md-3"><img src="../images/portal/02COMIXC5902A5122blue/collect.png" class="img-responsive" /></div>
        </div>
        <div class="col-md-12">
            <div class="col-md-7  text-row-2"><a href="product.html">得力（deli）1548A商务办公桌面计算器 太阳能双电源</a></div>
            <div class="col-md-2">¥50</div>
            <div class="col-md-3"><img src="../images/portal/002calculator1548A/collect.png" class="img-responsive" /></div>
        </div>
        <div class="col-md-12">
            <div class="col-md-7 text-row-2"><a href="product.html">戴尔(DELL)XPS13-9360-R1609 13.3</a></div>
            <div class="col-md-2">¥6299</div>
            <div class="col-md-3"><img src="../images/portal/12(DELL)XPS13gold/collect.png" class="img-responsive" /></div>
        </div>
        <div class="col-md-12">
            <div class="col-md-7 text-row-2"><a href="product.html">联想（Lenovo）IdeaPad310高配版</a></div>
            <div class="col-md-2">¥5298</div>
            <div class="col-md-3"><img src="../images/portal/13LenovoIdeaPad310_black/collect.png" class="img-responsive" /></div>
        </div>
    </div>
					</div>
				</div>*/