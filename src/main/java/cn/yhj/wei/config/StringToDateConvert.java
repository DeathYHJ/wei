package cn.yhj.wei.config;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConvert implements Converter<String, Date> {
    private String datePattern;
    public StringToDateConvert(String datePattern){
        this.datePattern=datePattern;
    }
    @Override
    public Date convert(String s) {
        Date date=null;
        try{
            date=new SimpleDateFormat(datePattern).parse(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        return date;
    }
}
