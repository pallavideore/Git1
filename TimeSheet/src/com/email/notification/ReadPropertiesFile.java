package com.email.notification;
import java.io.FileInputStream;
import java.util.Properties;
 
public class ReadPropertiesFile extends Constants
{
 public  static void readConfig() throws Exception
 {
 try
 {
 
     Properties pro = new Properties();
     String path = System.getenv("CATALINA_HOME")+"/webapps/app_conf.properties";
     System.out.println(System.getProperty("user.dir"));
     pro.load(new FileInputStream(path));    
     
     Constants.delay = pro.getProperty("delay");
     Constants.timetoquery = pro.getProperty("timetoquery");
     Constants.setFrom = pro.getProperty("setFrom");
     Constants.setPassword = pro.getProperty("setPassword");
     Constants.day = pro.getProperty("day");
     Constants.ConnectionString =pro.getProperty("ConnectionString");
     Constants.DBUSER = pro.getProperty("DBUSER");
     Constants.DBPASSWORD = pro.getProperty("DBPASSWORD");
     Constants.CONNECTIONDRIVER = pro.getProperty("CONNECTIONDRIVER");
     Constants.TimeHour = Integer.parseInt(pro.getProperty("TimeHour"));
     Constants.TimeMinute = Integer.parseInt(pro.getProperty("TimeMinute"));
     Constants.mailhost=pro.getProperty("mailhost");
     Constants.smtp_port=pro.getProperty("smtp_port");
     System.out.println(Constants.delay);
     System.out.println(Constants.timetoquery);
     System.out.println(Constants.setFrom);
     System.out.println(Constants.setPassword);
     System.out.println(Constants.day);
     System.out.println(Constants.ConnectionString);
     System.out.println(Constants.DBUSER);
     System.out.println(Constants.DBPASSWORD);
     System.out.println(Constants.CONNECTIONDRIVER);
     System.out.println(Constants.TimeHour);
     System.out.println(Constants.TimeMinute);
     System.out.println(Constants.mailhost);
     System.out.println(Constants.smtp_port);
     
     
     
     
     
        		   
 
 }
 catch(Exception e)
 {
            throw new Exception(e);
 }
 
 }
 
}
