package edu.tute.center_server.service;

import edu.tute.center_server.pojo.ResponseMsg;
import edu.tute.center_server.pojo.slaveRequest.joinClusterRequest;
import org.springframework.stereotype.Service;

@Service
public interface FrontendService {
    ResponseMsg joinCluster();
}
