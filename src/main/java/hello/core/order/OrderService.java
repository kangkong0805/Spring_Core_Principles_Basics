package hello.core.order;

public interface OrderService {

    /**
     * @param memberID 회원 아이디
     * @param itemName 상품명
     * @param itemPrice 상품 가격
     * @return 주문 결과 반환
     */
    Order createOrder(Long memberID, String itemName, int itemPrice);
}
