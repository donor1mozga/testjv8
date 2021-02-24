import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class test1 {
    @Test
    public void test() {
        {
            Configuration.startMaximized = true;
    }

        open("https://www.autodoc.de");

    }
}
