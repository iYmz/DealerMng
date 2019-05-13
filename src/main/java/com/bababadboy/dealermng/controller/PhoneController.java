package com.bababadboy.dealermng.controller;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.bababadboy.dealermng.entity.Phone;
import com.bababadboy.dealermng.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;




/**
 * @author iYmz
 */
@Transactional
@RestController
@RequestMapping(value = "/phones")
public class PhoneController {
    @Autowired
    private PhoneRepository phoneRepository;



    @GetMapping(value = "/{id}")
    public Object getPhoneById(@PathVariable("id") Long id){
        Phone p = phoneRepository.findPhoneById(id);
        return p;
    }

    //分頁查詢
    //http://localhost:8080/phones/pages?page=11&size=100
    @RequestMapping(value = "/pages", method = RequestMethod.GET)
    public Object listOrders(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                        @RequestParam(value = "size", defaultValue = "15") Integer size
                                        ) {
        //Sort sort = new Sort(Sort.Direction.DESC, "id");
       // Pageable pageable = PageRequest.of(page,size,sort);
        Pageable pageable = PageRequest.of(page,size);
        Page<Phone> pageOfPhone = phoneRepository.findAll(pageable);
        //List list = phoneRepository.findAll(pageable);
        return  pageOfPhone;
    }
}
