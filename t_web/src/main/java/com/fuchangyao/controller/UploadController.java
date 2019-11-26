package com.fuchangyao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import utils.FastDFSClient;

/**
 * Created by Administrator on 2019/11/15.
 */
@Controller
public class UploadController {

    @ResponseBody
    @CrossOrigin
    @RequestMapping( value = "/upload",produces = "application/json;charset=UTF-8",method = RequestMethod.POST)
    public String upload(MultipartFile file){
        //1、取文件的扩展名
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        try {
            //2、创建一个 FastDFS 的客户端
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:config/fdfs_client.conf");
            //3、执行上传处理
            String path = fastDFSClient.uploadFile(file.getBytes(), extName);
            //4、拼接返回的 url 和 ip 地址，拼装成完整的 url
            String url = "http://192.168.25.133/" + path;
            System.out.println(url);
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
    }
}
