package com.cy.store.controller;


import com.cy.store.entity.Order;
import com.cy.store.entity.Product;
import com.cy.store.service.IOrderService;
import com.cy.store.service.IProductService;
import com.cy.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import static com.cy.store.controller.BaseController.OK;
import javax.servlet.http.HttpSession;
import java.util.List;


@RequestMapping("PhaseUser")
public class PhaseController extends BaseController{
    @Autowired
    private IProductService productService;

    @Autowired
    private IOrderService orderService;

    @RequestMapping("phase_list")
    public JsonResult<List<Product>> getPhaseListandPhaseId() {
        List<Product> data = productService.findHotList();
        return new JsonResult<List<Product>>(OK, data);
    }

    @RequestMapping("phase")
    public JsonResult<Order> createPhase(Integer aid, Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 购物业务
        Order data = orderService.create(aid, cids, uid, username);
        return new JsonResult<Order>(OK, data);
    }

    @RequestMapping("phase_list")
    public JsonResult<List<Product>> getPhaseList() {
        List<Product> data = productService.findHotList();
        return new JsonResult<List<Product>>(OK, data);
    }




    @GetMapping("{id}/phases")
    public JsonResult<Product> getByPhaseId(@PathVariable("id") Integer id) {
        // 调用业务对象执行获取数据
        Product data = productService.findById(id);
        // 返回成功和数据
        return new JsonResult<Product>(OK, data);
    }




    @RequestMapping("phase_list")
    public JsonResult<List<Product>> getCurPhaseList() {
        List<Product> data = productService.findCurList();
        return new JsonResult<List<Product>>(OK, data);
    }

}
