package edu.tute.center_server.Bean;

public class Node {
    private String nodeId;
    private String nodeLocation;
    private String nodeAbility;
    private String nodeCPUCore;
    private String nodeCPUFrequency;
    private String nodeRAM;
    private String nodeTotalRAM;
    private String nodeAvailableHDD;
    private String nodeAvailableSSD;
    private String innerIP;
    private String outerIP;
    private String runService;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeTotalRAM() {
        return nodeTotalRAM;
    }

    public void setNodeTotalRAM(String nodeTotalRAM) {
        this.nodeTotalRAM = nodeTotalRAM;
    }

    public String getNodeLocation() {
        return nodeLocation;
    }

    public void setNodeLocation(String nodeLocation) {
        this.nodeLocation = nodeLocation;
    }

    public String getNodeAbility() {
        return nodeAbility;
    }

    public void setNodeAbility(String nodeAbility) {
        this.nodeAbility = nodeAbility;
    }

    public String getNodeCPUCore() {
        return nodeCPUCore;
    }

    public void setNodeCPUCore(String nodeCPUCore) {
        this.nodeCPUCore = nodeCPUCore;
    }

    public String getNodeCPUFrequency() {
        return nodeCPUFrequency;
    }

    public void setNodeCPUFrequency(String nodeCPUFrequency) {
        this.nodeCPUFrequency = nodeCPUFrequency;
    }

    public String getNodeRAM() {
        return nodeRAM;
    }

    public void setNodeRAM(String nodeRAM) {
        this.nodeRAM = nodeRAM;
    }

    public String getInnerIP() {
        return innerIP;
    }

    public void setInnerIP(String innerIP) {
        this.innerIP = innerIP;
    }

    public String getOuterIP() {
        return outerIP;
    }

    public void setOuterIP(String outerIP) {
        this.outerIP = outerIP;
    }

    public String getRunService() {
        return runService;
    }

    public void setRunService(String runService) {
        this.runService = runService;
    }

    public String getNodeAvailableHDD() {
        return nodeAvailableHDD;
    }

    public void setNodeAvailableHDD(String nodeAvailableHDD) {
        this.nodeAvailableHDD = nodeAvailableHDD;
    }

    public String getNodeAvailableSSD() {
        return nodeAvailableSSD;
    }

    public void setNodeAvailableSSD(String nodeAvailableSSD) {
        this.nodeAvailableSSD = nodeAvailableSSD;
    }

}
