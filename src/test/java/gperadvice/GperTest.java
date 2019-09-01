package gperadvice;

import com.gupao.edu.vip.pattern.observer.gperadvice.Gper;
import com.gupao.edu.vip.pattern.observer.gperadvice.Question;
import com.gupao.edu.vip.pattern.observer.gperadvice.Teacher;

/**
 * GperTest类
 *
 * @author wangjixue
 * @date 2019-09-01 15:42
 */
public class GperTest {
    public static void main(String[] args) {

        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Gper gper = Gper.getInstance();
        Question queastion = new Question("小王","相对路径转绝对路径");
        gper.publishQuestion(queastion);
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(queastion);


    }
}
