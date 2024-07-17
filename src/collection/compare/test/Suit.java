package collection.compare.test;

public enum Suit { //enum은 Enum을 상속받고 있다. final로 되있음.
    SPADE("♠"), // 스페이드(♠)
    HEART("♥"),// 하트(♥)

    DIAMOND("♦"),// 다이아몬드(♦)
    CLUB("♣");// 클로버(♣)
    private String icon;
    Suit(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }
}
