package com.space.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.space.domain.Diary;

import com.space.service.DiaryService;
import com.space.service.impl.DiaryServiceImpl;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@RestController
@RequestMapping("/Diary/*")
public class DiaryServlet extends BaseServlet {


    @Autowired
    DiaryService diaryService;

    public void setLog(){
          

        Integer uid=(Integer)req.getSession().getAttribute("id");
        Diary diary = new Diary();
        diary.setUid(uid);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(date);
        diary.setTime(s);
        String diary1 = jsonObject.getString("diary");
        JSONObject jsonObject1 = JSON.parseObject(jsonObject.getString("diary"));
        diary.setTitle(jsonObject1.getString("name"));
        diary.setContent(jsonObject1.getString("text"));

        diaryService.insert(diary);
    }


    public void deleteLogs() throws IOException {
          
        Integer id= Integer.valueOf(IOUtils.toString(req.getInputStream()));

        diaryService.delete(id);
    }

    public void modifyLogs() throws IOException {
          
        String contentType = req.getContentType();
        System.out.println(contentType);
        String s = IOUtils.toString(req.getInputStream());
        System.out.println(s);

        Integer id=(Integer) jsonObject.getInteger("id");
        Diary diary=new Diary();
        diary.setTitle(jsonObject.getString("name") );
        diary.setContent(jsonObject.getString("text") );
        diary.setId(id);

        diaryService.update(diary);
    }
    public void viewLogs() throws IOException {
          

        class ret{
            public Integer id;
            public String name;
            public String text;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
        Integer uid= (Integer) req.getSession().getAttribute("id");

        List<Diary> diaries = diaryService.selectByUid(uid);
        ArrayList<ret> rets = new ArrayList<>();
        for(Diary diary:diaries){
            ret ret = new ret();
            ret.id=diary.getId();
            ret.name=diary.getTitle();
            ret.text=diary.getContent();
            rets.add(ret);
        }
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(JSON.toJSONString(rets));
    }
}
