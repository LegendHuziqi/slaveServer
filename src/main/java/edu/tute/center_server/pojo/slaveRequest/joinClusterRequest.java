package edu.tute.center_server.pojo.slaveRequest;

public class joinClusterRequest {
    private String ip;
    private String nodeName;
    private int runServiceMaxAmount;
    private String location;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getRunServiceMaxAmount() {
        return runServiceMaxAmount;
    }

    public void setRunServiceMaxAmount(int runServiceMaxAmount) {
        this.runServiceMaxAmount = runServiceMaxAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
