package edu.tute.center_server.service.impl;

import com.alibaba.fastjson.JSONObject;
import edu.tute.center_server.dao.NodeMapper;
import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.slaveRequest.joinClusterRequest;
import edu.tute.center_server.service.FrontendService;
import edu.tute.center_server.utils.JedisClient;
import edu.tute.center_server.utils.OSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import oshi.SystemInfo;

@Component
public class FrontendServiceImpl implements FrontendService {
    @Autowired
    NodeMapper nodeMapper;
    @Autowired
    JedisClient jedisClient;

    @Override
    public ResponseMsg joinCluster() {
        ResponseMsg responseMsg = new ResponseMsg();
        SystemInfo systemInfo = new SystemInfo();
        OSUtils osUtils = new OSUtils();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("centerIp", "127.0.0.1");//center的ip
        long freq = systemInfo.getHardware().getProcessor().getMaxFreq()/100000000;
        int core = systemInfo.getHardware().getProcessor().getLogicalProcessorCount();
        jsonObject.put("nodeAbility",(int)freq * core);
        jsonObject.put("nodeCPUCore", core);
        jsonObject.put("nodeCPUFrequency", freq);
        long ram = systemInfo.getHardware().getMemory().getTotal();
        jsonObject.put("nodeRAM", osUtils.getPrintSize(ram));
//        jsonObject.put("nodeTotalROM", joinClusterRequest.getDisk());
        responseMsg.setMsg("获取系统信息成功");
        responseMsg.setData(jsonObject);
        responseMsg.setStatusCode(0);
        return responseMsg;
    }



}
