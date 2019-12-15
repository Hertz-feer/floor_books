package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.pojo.Brand;
import com.showfloor.floor_books.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BrandController {

    @Resource
    private BrandService brandServiceImpl;

    @GetMapping("/bras")  //品牌列表
    public String showBras(Model model){
        List<Brand> list = brandServiceImpl.selectAll();
        model.addAttribute("brands",list);
        return "/bra/list";
    }

    @GetMapping("/bra")   //跳转到添加页面
    public String toAddBra(Model model){
        return "/bra/add";
    }

    @PostMapping("/bra")   //添加
    public String addBra(Brand brand, Model model){
        Brand back = brandServiceImpl.insertBrand(brand);
        if(back != null){
            return "redirect:/bras";
        }else{
            model.addAttribute("msg","添加失败");
            return "/bra/add";
        }
    }

    @GetMapping("/bra/{id}")  //跳转到修改界面
    public String toUpdateBra(@PathVariable("id") Integer id, Model model){
        Brand brand = brandServiceImpl.selectById(id);
        model.addAttribute("brand",brand);
        return "/bra/update";
    }

    @PutMapping("/bra")
    public String updateBra(Brand brand, Model model){
        Brand back = brandServiceImpl.updateBrand(brand);
        if(back != null ){
            return "redirect:/bras";
        }else{
            model.addAttribute("msg","修改失败");
            return "redirect:/bra/"+brand.getId().toString();
        }
    }

    @DeleteMapping("/bra/{id}")
    public String deleteBra(@PathVariable Integer id, Model model){
        brandServiceImpl.deleteBrand(id);
        return "redirect:/bras";
    }
}
