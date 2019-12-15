package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.pojo.Brand;
import com.showfloor.floor_books.pojo.Inventory;
import com.showfloor.floor_books.service.BrandService;
import com.showfloor.floor_books.service.InventoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InventoryController {

    @Resource
    private InventoryService inventoryServiceImpl;
    @Resource
    private BrandService brandServiceImpl;

    @GetMapping("/invs")  //附件列表
    public String showInvs(Model model){
        List<Inventory> list = inventoryServiceImpl.selectAll();
        model.addAttribute("invs",list);
        return "/inv/list";
    }

    @GetMapping("/inv")   //跳转到添加页面
    public String toAddAcc(Model model){
        List<Brand> brandList = brandServiceImpl.selectAll();
        model.addAttribute("brands",brandList);
        return "/inv/add";
    }

    @PostMapping("/inv")   //添加
    public String addAccessories(Inventory inventory, Model model){
        Inventory back = inventoryServiceImpl.InsertInventory(inventory);
        if(back != null){
            return "redirect:/invs";
        }else{
            model.addAttribute("msg","添加失败");
            return "/inv/add";
        }
    }

    @GetMapping("/inv/{id}")  //跳转到修改界面
    public String toUpdateAcc(@PathVariable("id") Integer id, Model model){
        List<Brand> brands = brandServiceImpl.selectAll();
        model.addAttribute("brands",brands);
        Inventory inventory = inventoryServiceImpl.selectById(id);
        model.addAttribute("inventory",inventory);
        return "/inv/update";
    }

    @PutMapping("/inv")
    public String updateAcc(Inventory inventory, Model model){
        Inventory back = inventoryServiceImpl.updateInventory(inventory);
        if(back != null ){
            return "redirect:/invs";
        }else{
            model.addAttribute("msg","修改失败");
            return "redirect:/inv/"+inventory.getId().toString();
        }
    }

}
