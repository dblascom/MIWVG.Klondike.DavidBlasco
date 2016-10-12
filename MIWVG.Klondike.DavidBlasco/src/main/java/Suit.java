

public enum Suit {

    O("o"), C("c"), E("e"), B("b");

    private String value;

    private Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
