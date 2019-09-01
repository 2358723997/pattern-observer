package guava;

import com.google.common.eventbus.EventBus;
import com.gupao.edu.vip.pattern.observer.gperadvice.Gper;
import com.gupao.edu.vip.pattern.observer.gperadvice.Question;
import com.gupao.edu.vip.pattern.observer.gperadvice.Teacher;
import com.gupao.edu.vip.pattern.observer.guava.GuavaEvent;

/**
 * GperTest类
 *
 * @author wangjixue
 * @date 2019-09-01 15:42
 */
public class GuavaTest {
    public static void main(String[] args) {
        GuavaEvent event = new GuavaEvent();
        EventBus eventBus = new EventBus();
        eventBus.register(event);
        eventBus.post("Tom");

    }
}
