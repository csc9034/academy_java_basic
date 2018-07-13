package shop.reply;


/**
 * 매니저가 특정 규정에 따른 응답하는 방법을
 * 제시하는 인터페이스
 * @author CHO
 *
 */
public interface Reply {
	
	/**
	 * 입력 된 object에 따라 적절한 응답을 한다.
	 * @param object
	 */
	public abstract void reply(Object object);
	
	
}
