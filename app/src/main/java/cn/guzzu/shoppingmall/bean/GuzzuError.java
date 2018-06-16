package cn.guzzu.shoppingmall.bean;

public class GuzzuError {

    /**
     * error : ERR_INVALID_AUTH
     * detail : {"type":"GuzzuError","appVersion":"2.7.3","gitHash":"9342bac","message":"signin required"}
     */

    private String error;
    private DetailBean detail;

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

    public static class DetailBean {
        /**
         * type : GuzzuError
         * appVersion : 2.7.3
         * gitHash : 9342bac
         * message : signin required
         */

        private String type;
        private String appVersion;
        private String gitHash;
        private String message;

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
    }
}
