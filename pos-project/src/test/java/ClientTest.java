import com.pos.client.PosFactory;
import com.pos.common.model.OrderMain;

import java.util.List;

/**
 * Title: ClientTest<br>
 * Description: FIXME ClientTest Description
 *
 * @author: Sample.Hsu
 * @version: 1.0
 */
public class ClientTest {

	public static void main(String[] args) {

		List<OrderMain> orderMainList = PosFactory.getInstance().getOrderService().queryOrderMainList();

		System.out.println(orderMainList);
	}
}
