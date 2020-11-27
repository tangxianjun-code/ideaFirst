package com.zking.test.controller;

import com.zking.test.model.Book;
import com.zking.test.service.IBookService;
import com.zking.test.service.impl.TestImpl;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.RowSet;
import java.io.*;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class Hello {
    @Autowired
    private IBookService bookService;
//    @Autowired
//    TestImpl test;

    @RequestMapping("test")
    private String ttest(Model model,Book book){
        List<Book> books = bookService.select2(book);
        model.addAttribute("list",books);
        return "book";
    }

    @RequestMapping("doadd")
    public String doAdd(){
        return "add";
    }

    @ModelAttribute
    public void test(Model model){
        Book book=new Book();
        System.out.println("test");
        model.addAttribute("book",book);
    }

    @RequestMapping("add")
    public String addBook(HttpSession session, @Validated @ModelAttribute Book book, BindingResult bindingResult){
        System.out.println(1);
        System.out.println(bindingResult.hasFieldErrors());
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            bindingResult.rejectValue("bookName",null,"不能为空");
            session.setAttribute("msg","空");
            return "redirect:doadd";
        }
        int n = bookService.insert(book);
        if(n>0){
            return "redirect:test";
        }else{
            return "add";
        }
    }

//        int n= bookService.insert(book);
//        if (n>0) {
//            return "redirect:test";
//        }
//        else{
//            return "add";
//        }

    @RequestMapping("del")
    public String del(Book book){
        int n=bookService.deleteByPrimaryKey(book.getBookId());
            return "redirect:test";
    }

    @RequestMapping("doUpdate")
    public String doUpdate(Model model, Book book){
        Book book1=bookService.selectByPrimaryKey(book.getBookId());
        model.addAttribute("b",book1);
        System.out.println(book1);
        return "update";
    }

    @RequestMapping("upd")
    public String update(){
        return  "redirect:test";
    }

    @RequestMapping("toUpload")
    public String toload(){
        return "upload";
    }

    @RequestMapping("doupload")
    public Object doUpload(MultipartFile mf){
        String filename = mf.getOriginalFilename();
        //文件保存位置
        File file=new File("E:\\img\\"+filename);
        System.out.println("文件类型："+mf.getContentType());
        try {
            //保存文件
            mf.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filename;
    }

//    @RequestMapping(value="/download")
//    public ResponseEntity<byte[]> download(@RequestParam String fileId){
//
//        //先根据文件id查询对应图片信息
//
//        //下载关键代码
//        RowSet bookFile;
//        File file=new File(bookFile.getUrl());
//        HttpHeaders headers = new HttpHeaders();//http头信息
//        String downloadFileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");//设置编码
//        headers.setContentDispositionFormData("attachment", downloadFileName);
//        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//        //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
//        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
//
//    }

//    @RequestMapping("/down")
//    public void down(HttpServletRequest request, HttpServletResponse response) throws Exception{
//
//        String fileName = request.getSession().getServletContext().getRealPath("img")+"/3.gif";
//
//        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
//
//        String filename = "下载文件.jpg";
//
//        filename = URLEncoder.encode(filename,"UTF-8");
//
//        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
//
//        response.setContentType("multipart/form-data");
//
//        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//        int len = 0;
//        while((len = bis.read()) != -1){
//            out.write(len);
//            out.flush();
//        }
//        out.close();
//    }


}
