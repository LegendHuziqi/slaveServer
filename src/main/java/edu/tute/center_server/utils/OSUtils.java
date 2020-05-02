package edu.tute.center_server.utils;

import org.springframework.beans.factory.annotation.Autowired;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OperatingSystem;


public class OSUtils {
    public int getnodeAbility(){
//        int core = os.getProcessCount();
        SystemInfo systemInfo = new SystemInfo();
        long temp = systemInfo.getHardware().getProcessor().getMaxFreq()/100000000;
        int freq = (int) temp;
        int core = systemInfo.getHardware().getProcessor().getLogicalProcessorCount();
        System.out.println(temp);
        System.out.println(core);
        return freq*core;
    }
    public String getPrintSize(long size) {
        //如果字节数少于1024，则直接以B为单位，否则先除于1024，后3位因太少无意义
        if (size < 1024) {
//            return String.valueOf(size) + "B";
            return String.valueOf(size);
        } else {
            size = size / 1024;
        }
        //如果原字节数除于1024之后，少于1024，则可以直接以KB作为单位
        //因为还没有到达要使用另一个单位的时候
        //接下去以此类推
        if (size < 1024) {
//            return String.valueOf(size) + "KB";
            return String.valueOf(size) ;
        } else {
            size = size / 1024;
        }
        if (size < 1024) {
            //因为如果以MB为单位的话，要保留最后1位小数，
            //因此，把此数乘以100之后再取余
            size = size * 100;
            return String.valueOf((size / 100)) + "."
                    + String.valueOf((size % 100)) ;
        } else {
            //否则如果要以GB为单位的，先除于1024再作同样的处理
            size = size * 100 / 1024;
            return String.valueOf((size / 100)) + "."
                    + String.valueOf((size % 100)) ;
        }
    }
    public int getCPUCore(){
        return 1;
    }

    public String getCPUFrequency(){
        return null;
    }

    public static void main(String[] args) {
        String test = "java.sql.SQLIntegrityConstraintViolationException: Duplicate entry '测试公司' for key";
        if(test.contains("Duplicate")){
            System.out.println("存在重复");
        }
        else {
            System.out.println("不重复");
        }
    }
}
