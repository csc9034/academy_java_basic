package shop.view;

/**
 * 매니저가 제품 정보를 등록, 수정, 삭제한 후
 * 일정한 양식의 응답을 구현
 * @author CHO
 *
 */
public class MessageReply implements Reply {

	@Override
	public void reply(Object object) {
		String message = (String) object;
		System.out.println(message);
	}

}
