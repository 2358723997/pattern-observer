package event;

import com.gupao.edu.vip.pattern.observer.events.mouseevents.Mouse;
import com.gupao.edu.vip.pattern.observer.events.mouseevents.MouseEventCallback;
import com.gupao.edu.vip.pattern.observer.events.mouseevents.MouseEventType;

/**
 * EventTest类
 *
 * @author wangjixue
 * @date 2019-09-01 16:51
 */
public class EventTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        MouseEventCallback callback = new MouseEventCallback();

        // 监听事件
        mouse.addListenr(MouseEventType.ON_BLUR.getValue(),callback);
        mouse.addListenr(MouseEventType.ON_CLICK.getValue(),callback);

        // 触发事件
        mouse.blur();
        mouse.click();
    }
}
