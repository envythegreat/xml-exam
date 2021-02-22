package restapi;

public enum AccountType {

    CREDIT,
    DEBIT;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}