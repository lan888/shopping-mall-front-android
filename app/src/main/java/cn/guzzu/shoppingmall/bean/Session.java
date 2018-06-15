package cn.guzzu.shoppingmall.bean;

public class Session {
    /**
     * _id : zinRaAaUIpsC3wQ9EktYiFLqQrJ5BRRF
     * user : {"_id":"5b0fb92620f931129a8ec022","createdAt":"2018-05-31T08:58:14.503Z","updatedAt":"2018-05-31T08:58:14.503Z","name":"新用户84037","mobilePhone":"13537284037","sourceClientType":"shoppingmall","__v":0}
     * clientType : cn.guzzu.shoppingmall
     * ip : 113.78.15.110
     * host : mp-dev.guzzu.cn
     * createdAt : 2018-06-15T07:46:18.293Z
     * expireAt : 2018-06-15T09:02:17.263Z
     * __v : 0
     */

    private String _id;
    private User user;
    private String clientType;
    private String ip;
    private String host;
    private String createdAt;
    private String expireAt;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public static class User {
        /**
         * _id : 5b0fb92620f931129a8ec022
         * createdAt : 2018-05-31T08:58:14.503Z
         * updatedAt : 2018-05-31T08:58:14.503Z
         * name : 新用户84037
         * mobilePhone : 13537284037
         * sourceClientType : shoppingmall
         * __v : 0
         */

        private String _id;
        private String createdAt;
        private String updatedAt;
        private String name;
        private String mobilePhone;
        private String sourceClientType;
        private int __v;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getSourceClientType() {
            return sourceClientType;
        }

        public void setSourceClientType(String sourceClientType) {
            this.sourceClientType = sourceClientType;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }
    }
}
