package config;

public enum ConfigKeys {
    BROWSER("browser"),
    BASE_URL("baseUrl"),
    HEADLESS("headless"),
    USERNAME("username"),
    PASSWORD("password"),
    WRONGPASSWORD("wrongPassword"),
    FIRSTNAME("firstname"),
    SURNAME("surname"),
    EMAIL("email"),
    PHONENUMBER("cell"),
    TCID("tcID"),
    ADDRESSTITLE("addressTitle"),
    LOCATION("location"),
    TOWN("town"),
    ADDRESS("address");


    private final String key;

    ConfigKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
