package com.cppba.core;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 */

public class Main {

    static String domainName = "Articles"; //类名
    static String packageName = "com.cppba";//类包

    static String templateDir = "\\src\\main\\webapp\\template\\";
    static String sourcePath = System.getProperty("user.dir")+templateDir;
    static String resultDir = "\\out";
    static String targetPath = System.getProperty("user.dir")
            + resultDir + "\\"
            + packageName.replace(".", "\\");

    public static void main(String []args) throws Exception{

        Map<String,Object> map = new HashMap();
        map.put("DaoTemplate.java","dao/" + domainName + "Dao.java");
        map.put("ServiceTemplate.java","service/" + domainName + "Service.java");
        map.put("ServiceImplTemplate.java","service/impl/" + domainName + "ServiceImpl.java");
        map.put("DtoTemplate.java","dto/" + domainName + "Dto.java");

        for(String templateFile:map.keySet()){
            String targetFile = (String) map.get(templateFile);
            Properties pro = new Properties();
            pro.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
            pro.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
            pro.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, sourcePath);
            VelocityEngine ve = new VelocityEngine(pro);

            VelocityContext context = new VelocityContext();
            context.put("domainName",domainName);
            context.put("packageName",packageName);

            Template t = ve.getTemplate(templateFile, "UTF-8");

            File file = new File(targetPath, targetFile);
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            if (!file.exists())
                file.createNewFile();

            FileOutputStream outStream = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(outStream,
                    "UTF-8");
            BufferedWriter sw = new BufferedWriter(writer);
            t.merge(context, sw);
            sw.flush();
            sw.close();
            outStream.close();
            System.out.println("成功生成Java文件:"
                    + (targetPath + targetFile).replaceAll("/", "\\\\"));
        }
    }
}
