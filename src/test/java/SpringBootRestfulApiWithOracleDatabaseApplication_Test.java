import com.kkhindigyan.app.SpringBootRestfulApiWithOracleDatabaseApplication;
import io.keploy.regression.Mode;
import io.keploy.utils.HaltThread;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

public class SpringBootRestfulApiWithOracleDatabaseApplication_Test {

    @Test
    public void TestKeploy() throws InterruptedException {

        CountDownLatch countDownLatch = HaltThread.getInstance().getCountDownLatch();
        Mode.setTestMode();

        new Thread(() -> {
            SpringBootRestfulApiWithOracleDatabaseApplication.main(new String[]{""});
            countDownLatch.countDown();
        }).start();

        countDownLatch.await();
    }
}