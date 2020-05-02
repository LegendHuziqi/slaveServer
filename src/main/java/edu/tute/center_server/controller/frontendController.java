package edu.tute.center_server.controller;

import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.slaveRequest.joinClusterRequest;
import edu.tute.center_server.service.FrontendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class frontendController {
    @Autowired
    FrontendService frontendService;

    @PostMapping("/joinCluster")
    public ResponseMsg joinCluster(){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = frontendService.joinCluster();
        return responseMsg;
    }
}
