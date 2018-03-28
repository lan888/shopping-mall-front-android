package guzzu.ian.guzzudemo.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ian on 2018/3/9.
 */

public class User {

    /**
     * __v : 0
     * user : {"_id":"5aa0fc20104b1e386775e3a1","name":"Ian Chan","email":"ian@guzzu.com","isMpAdmin":true,"isMasterAdmin":true,"image":{"url":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0"},"updatedAt":"2018-03-08T09:05:19.281Z","createdAt":"2017-10-11T01:39:08.662Z","mobilePhone":""}
     * clientType : pos
     * expireAt : 2018-03-12T02:56:42.330Z
     * ip : 117.136.40.33
     * host : mp-dev.guzzu.cn
     * _id : 5aa5de5a82859d27cc6a40b1
     * createdAt : 2018-03-12T01:56:42.330Z
     */

    private int __v;
    private UserBean user;
    private String clientType;
    private String expireAt;
    private String ip;
    private String host;
    private String _id;
    private String createdAt;
    /**
     * error : ERR_INVALID_PARAM
     * detail : {"type":"GuzzuError","appVersion":"2.2.8","gitHash":"852052e","message":"invalid param","data":{"isJoi":true,"name":"ValidationError","details":[{"message":"\"email\" is not allowed to be empty","path":"email","type":"any.empty","context":{"key":"email"}}],"_object":{"email":"","password":"","clientType":"pos"}}}
     */

    private String error;
    private DetailBean detail;

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DetailBean getDetail() {
        return detail;
    }

    public void setDetail(DetailBean detail) {
        this.detail = detail;
    }

    public static class UserBean {
        /**
         * _id : 5aa0fc20104b1e386775e3a1
         * name : Ian Chan
         * email : ian@guzzu.com
         * isMpAdmin : true
         * isMasterAdmin : true
         * image : {"url":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0"}
         * updatedAt : 2018-03-08T09:05:19.281Z
         * createdAt : 2017-10-11T01:39:08.662Z
         * mobilePhone :
         */

        private String _id;
        private String name;
        private String email;
        private boolean isMpAdmin;
        private boolean isMasterAdmin;
        private ImageBean image;
        private String updatedAt;
        private String createdAt;
        private String mobilePhone;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean isIsMpAdmin() {
            return isMpAdmin;
        }

        public void setIsMpAdmin(boolean isMpAdmin) {
            this.isMpAdmin = isMpAdmin;
        }

        public boolean isIsMasterAdmin() {
            return isMasterAdmin;
        }

        public void setIsMasterAdmin(boolean isMasterAdmin) {
            this.isMasterAdmin = isMasterAdmin;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public static class ImageBean {
            /**
             * url : http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ8RXRYEvkls4AI3ViaZUCLpF9uwzpGbfm2U8AOV3d6WELZxD9HOwv5Av9ibN22Sib83bmQCo9udCukw/0
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class DetailBean {
        /**
         * type : GuzzuError
         * appVersion : 2.2.8
         * gitHash : 852052e
         * message : invalid param
         * data : {"isJoi":true,"name":"ValidationError","details":[{"message":"\"email\" is not allowed to be empty","path":"email","type":"any.empty","context":{"key":"email"}}],"_object":{"email":"","password":"","clientType":"pos"}}
         */

        private String type;
        private String appVersion;
        private String gitHash;
        private String message;
        private DataBean data;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getGitHash() {
            return gitHash;
        }

        public void setGitHash(String gitHash) {
            this.gitHash = gitHash;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * isJoi : true
             * name : ValidationError
             * details : [{"message":"\"email\" is not allowed to be empty","path":"email","type":"any.empty","context":{"key":"email"}}]
             * _object : {"email":"","password":"","clientType":"pos"}
             */

            private boolean isJoi;
            private String name;
            private ObjectBean _object;
            private List<DetailsBean> details;

            public boolean isIsJoi() {
                return isJoi;
            }

            public void setIsJoi(boolean isJoi) {
                this.isJoi = isJoi;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public ObjectBean get_object() {
                return _object;
            }

            public void set_object(ObjectBean _object) {
                this._object = _object;
            }

            public List<DetailsBean> getDetails() {
                return details;
            }

            public void setDetails(List<DetailsBean> details) {
                this.details = details;
            }

            public static class ObjectBean {
                /**
                 * email :
                 * password :
                 * clientType : pos
                 */

                private String email;
                private String password;
                @SerializedName("clientType")
                private String clientTypeX;

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getClientTypeX() {
                    return clientTypeX;
                }

                public void setClientTypeX(String clientTypeX) {
                    this.clientTypeX = clientTypeX;
                }
            }

            public static class DetailsBean {
                /**
                 * message : "email" is not allowed to be empty
                 * path : email
                 * type : any.empty
                 * context : {"key":"email"}
                 */

                private String message;
                private String path;
                private String type;
                private ContextBean context;

                public String getMessage() {
                    return message;
                }

                public void setMessage(String message) {
                    this.message = message;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public ContextBean getContext() {
                    return context;
                }

                public void setContext(ContextBean context) {
                    this.context = context;
                }

                public static class ContextBean {
                    /**
                     * key : email
                     */

                    private String key;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }
                }
            }
        }
    }
}
