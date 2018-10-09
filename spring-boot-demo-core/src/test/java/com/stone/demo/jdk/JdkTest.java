//package com.stone.demo.jdk;
//
//import com.stone.demo.domain.Action;
//import org.springframework.beans.BeanUtils;
//
//import java.beans.PropertyDescriptor;
//import java.util.Date;
//
///**
// * Created by shikun on 2018/10/7.
// */
//public class JdkTest {
//    public static void main(String[] args) {
//        PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(Action.class);
//        if(propertyDescriptors != null  && propertyDescriptors.length > 0) {
//            for (PropertyDescriptor pd : propertyDescriptors) {
//                System.out.println(pd.getPropertyType() + " , " + pd.getReadMethod() + " , " + pd.getWriteMethod());
//            }
//        }
//
//        System.out.println(new Date().getTime());
//        System.out.println(System.currentTimeMillis());
//    }
//}
