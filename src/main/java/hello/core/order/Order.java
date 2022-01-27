package hello.core.order;

public class Order {

    private Long memberId;      // 회원 아이디
    private String itemName;    // 상품 이름
    private int itemPrice;      // 상품 가격
    private int discountPrice;  // 할인 가격

    // 생성자
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    // 데이터 접근 및 설정
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int dicountPrice) {
        this.discountPrice = dicountPrice;
    }

    // 할인된 금액
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    // 주문 결과 출력
    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", dicountPrice=" + discountPrice +
                '}';
    }
}
