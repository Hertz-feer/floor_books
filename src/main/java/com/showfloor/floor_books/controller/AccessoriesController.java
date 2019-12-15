package com.showfloor.floor_books.controller;
/**
 * 附件控制层
 */

import com.showfloor.floor_books.pojo.Accessories;
import com.showfloor.floor_books.pojo.Brand;
import com.showfloor.floor_books.service.AccessoriesService;
import com.showfloor.floor_books.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AccessoriesController {

    @Resource
    private AccessoriesService accessoriesServiceImpl;
    @Resource
    private BrandService brandServiceImpl;

    @GetMapping("/accs")  //附件列表
    public String showAccs(Model model){
        List<Accessories> list = accessoriesServiceImpl.getAll();
        model.addAttribute("accs",list);
        return "/acc/list";
    }

    @GetMapping("/acc")   //跳转到添加页面
    public String toAddAcc(Model model){
        List<Brand> brands = brandServiceImpl.selectAll();
        model.addAttribute("brands",brands);
        return "/acc/add";
    }

    @PostMapping("/acc")   //添加
    public String addAccessories(Accessories accessories, Model model){
        Accessories back = accessoriesServiceImpl.createAccessories(accessories);
        if(back != null){
            return "redirect:/accs";
        }else{
            model.addAttribute("msg","添加失败");
            return "/acc/add";
        }
    }

    @GetMapping("/acc/{id}")  //跳转到修改界面
    public String toUpdateAcc(@PathVariable("id") Integer id, Model model){
        List<Brand> brands = brandServiceImpl.selectAll();
        model.addAttribute("brands",brands);
        Accessories accessories = accessoriesServiceImpl.selectById(id);
        model.addAttribute("accessories",accessories);
        return "/acc/update";
    }

    @PutMapping("/acc")
    public String updateAcc(Accessories accessories, Model model){
        Accessories back = accessoriesServiceImpl.updateAccessories(accessories);
        if(back != null ){
            return "redirect:/accs";
        }else{
            model.addAttribute("msg","修改失败");
            return "redirect:/acc/"+accessories.getId().toString();
        }
    }

    @DeleteMapping("/acc/{id}")
    public String deleteAcc(@PathVariable Integer id,Model model){
        accessoriesServiceImpl.deleteAccessories(id);
        return "redirect:/accs";
    }
}
