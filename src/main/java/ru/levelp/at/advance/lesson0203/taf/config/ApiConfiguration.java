package ru.levelp.at.advance.lesson0203.taf.config;

public record ApiConfiguration(
        String url,
        String basePath,
        String key,
        String token
) {
}


// public class ApiConfiguration {
//
//    private final String url;
//    private final String basePath;
//    private final String key;
//    private final String token;
//
//    public ApiConfiguration(String url, String basePath, String key, String token) {
//        this.url = url;
//        this.basePath = basePath;
//        this.key = key;
//        this.token = token;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getBasePath() {
//        return basePath;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ApiConfiguration that = (ApiConfiguration) o;
//        return Objects.equals(url, that.url) && Objects.equals(basePath, that.basePath)
//                && Objects.equals(key, that.key) && Objects.equals(token, that.token);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(url, basePath, key, token);
//    }
//
//    @Override
//    public String toString() {
//        return "ApiConfiguration{"
//                + "url='" + url + '\''
//                + ", basePath='" + basePath + '\''
//                + ", key='" + key + '\''
//                + ", token='" + token + '\''
//                + '}';
//    }
//}
