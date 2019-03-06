package com.guoyasoft.gyautotest.ui.testCase.test.demo1223;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class TestDemo extends BaseUI {

    @Test
    public void testDemo1() {
        //打开余小乐的个人demo网站
        driver.get("https://yulegh.github.io/vue-element-test/index.html");
        //定位组件这个元素并点击
        driver.findElement(By.xpath("//div[contains(text(),'组件')]")).click();
        sleep(1);
        //定位双向绑定这个元素并点击
        driver.findElement(By.xpath("//li[contains(text(),'双向绑定')]")).click();
        sleep(1);
        //定位iframe框并将driver切换到iframe框中
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='component/demoDataBindTwoWay.html']")));
        //定位iframe框界面中的点击打印前的输入框
        driver.findElement(By.xpath("//input[@id='val1']")).sendKeys("qwerdf");
        sleep(1);
        //定位iframe框界面中的点击打印的按钮并点击
        driver.findElement(By.xpath("//button[contains(text(),'点击打印')]")).click();
        sleep(1);
        //将driver切换到alert框中
        driver.switchTo().alert().accept();
        //将driver切换回原窗口中
        driver.switchTo().defaultContent();
        //定位Table这个元素并点击
        driver.findElement(By.xpath("//div[contains(text(),'Table')]")).click();
        //线程休息5秒
        sleep(5);
    }

    @Test
    public void testDemo2() {
        driver.get("http://blog.gdfengshuo.com/example/work/#/login");
        sleep(1);
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='username']"));
        username.sendKeys(Keys.CONTROL + "a" + Keys.DELETE );
        sleep(1);
        username.sendKeys("guoya2018");
        sleep(1);
        WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='password']"));
        pwd.sendKeys(Keys.CONTROL + "a" + Keys.DELETE );
        pwd.sendKeys("guoya2018");
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(),'基础表格')]")).click();
        sleep(1);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a/i"))).perform();
        sleep(1);
        WebElement element = (new WebDriverWait(driver,3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'有2条未读消息')]")));
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(),'schart图表')]")).click();
        sleep(1);
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript("document.getElementsByClassName(\"content\")[0].scrollBy(0, 300)");
        sleep(1);
        jsDriver.executeScript("document.getElementsByClassName(\"content\")[0].scrollBy(0, 300)");
        sleep(1);
        jsDriver.executeScript("document.getElementsByClassName(\"content\")[0].scrollBy(0, 300)");
        sleep(5);
    }

    @Test
    public void testDemo3() {
        driver.get("http://blog.gdfengshuo.com/example/work/#/login");
        sleep(1);
        driver.findElement(By.xpath("//button/span[contains(text(),'登录')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//span[contains(text(),'表单相关')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//li[contains(text(),'基本表单')]")).click();
        sleep(1);
        driver.findElement(By.xpath("//li/span[contains(text(),'自定义图标')]")).click();
        sleep(1);
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//i[@class='el-icon-lx-pic']"));
        //移动到元素element对象的“顶端”与当前窗口的“顶部”对齐
        jsDriver.executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(1);
        //移动到元素element对象的“底端”与当前窗口的“底部”对齐
        jsDriver.executeScript("arguments[0].scrollIntoView(false);", element);
        sleep(1);
        //移动到页面最底部
        jsDriver.executeScript("document.getElementsByClassName(\"content\")[0].scrollTo(0, 10000)");
        sleep(1);
        //移动到页面最顶端
        jsDriver.executeScript("document.getElementsByClassName(\"content\")[0].scrollTo(0, 0)");
        sleep(1);
        driver.findElement(By.xpath("//li/a[contains(text(),'自定义图标')]/following::span/i[@class='el-icon-close']")).click();
        sleep(1);
        driver.findElement(By.xpath("//li/span[contains(text(),'schart图表')]"));
//        jsDriver.executeScript();
    }
}
