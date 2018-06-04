package cn.guzzu.shoppingmall.bean;

import java.io.Serializable;

public class User implements Serializable {

    private String sessionId;
    private String clientType;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
