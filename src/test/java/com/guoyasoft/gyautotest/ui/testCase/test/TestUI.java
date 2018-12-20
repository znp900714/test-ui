package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class TestUI extends BaseUI {

    @Test
    public void testTextInput() {
        //打开淘宝官网
        driver.get("https://www.taobao.com/");
        //定位淘宝搜索输入框
        WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
        //定位搜索按钮
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='btn-search tb-bg']"));
        //定位密码登录超链接
//        text.clear();
//        text.sendKeys("手机");
//        searchBtn.click();
        sendKeys(text,"手机");
        click(searchBtn);
        sleep(2);
    }

    @Test
    public void testLink() {
        //打开淘宝官网
        driver.get("https://www.taobao.com/");
        //定位女装超链接元素
        WebElement linktext = driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
        //创建鼠标操作对象
        Actions actions = new Actions(driver);
        //ctrl+点击
        //actions.keyDown(Keys.CONTROL).click(linktext).keyUp(Keys.CONTROL).perform();
        sleep(3);
        //shift+点击
        actions.keyDown(Keys.SHIFT).click(linktext).keyUp(Keys.SHIFT).perform();
        sleep(3);
    }

    //测试下拉框
    @Test
    public void testSelect() {
        driver.get("C:\\Users\\LENOVO\\Desktop\\基础班学习资料\\2018-12-13\\demo.html");
        sleep(2);
        //定位下拉框元素
        WebElement select = driver.findElement(By.xpath("//select"));
        //操作下拉框
        Select options = new Select(select);
        //根据下拉元素的文本内容选择下拉选项值
        options.selectByVisibleText("香蕉");
        sleep(2);
        //根据下拉元素的索引选择下拉选项值
        options.selectByIndex(0);
        sleep(2);
        //根据下拉元素的value属性值选择下拉选项值
        options.selectByValue("juzi");
        sleep(2);
    }

    //测试日期控件
    @Test
    public void testDate() {
        driver.get("C:\\Users\\LENOVO\\Desktop\\基础班学习资料\\2018-12-13\\demo1.html");
        sleep(2);
        String js1 = "var xpath = \"//input[@type='date']\";" +
                "var res = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null);" +
                "var e1 = res.iterateNext();" +
                "var e2 = res.iterateNext();" +
                "e1.removeAttribute(\"readonly\");" +
                "e1.value = \"2018-12-01\";" +
                "e2.removeAttribute(\"readonly\");" +
                "e2.value=\"2018-12-31\";";
        JavascriptExecutor jsDriver = (JavascriptExecutor)driver;
        jsDriver.executeScript(js1);
        sleep(10);
    }

    //测试导航栏
    @Test
    public void testNavigate() {
        //打开百度首页
        driver.get("https://www.baidu.com");
        //线程休息2秒
        sleep(2);
        //打开淘宝官网
        driver.get("https://www.taobao.com");
        //线程休息2秒
        sleep(2);
        //网页回退到百度首页
        driver.navigate().back();
        //线程休息2秒
        sleep(2);
        //网页前进到淘宝官网
        driver.navigate().forward();
        //线程休息2秒
        sleep(2);
        //网页在淘宝官网刷新一次
        driver.navigate().refresh();
        //线程休息2秒
        sleep(2);
        //网页跳转到京东官网
        driver.navigate().to("https://www.jd.com");
        //线程休息2秒
        sleep(2);
    }

    //测试果芽登录页面
    @Test
    public void testLogin() {

    }

    //测试果芽注册页面
    @Test
    public void testSignUp() {
        //打开果芽注册页面
        driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
        //线程休息2秒
        sleep(2);
        //定位用户名输入框
        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        //定位真实姓名输入框
        WebElement realName = driver.findElement(By.xpath("//input[@id='realName']"));
        //定位密码输入框
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        //定位确认密码输入框
        WebElement repwd = driver.findElement(By.xpath("//input[@id='password2']"));
        //定位手机输入框
        WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
        //定位年龄输入框
        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        //定位校验码输入框
        WebElement checkCode = driver.findElement(By.xpath("//input[@id='checkCode']"));
        //定位注册按钮
        WebElement submitBtn = driver.findElement(By.xpath("//input[@id='submitBtn']"));
        //清空用户名输入框
        userName.clear();
        //给用户名输入框填值
        userName.sendKeys("lxb2018");
        //线程休息1秒
        sleep(1);

        //清空真实姓名输入框
        realName.clear();
        //给真实姓名输入框填值
        realName.sendKeys("刘小备2018");
        //线程休息1秒
        sleep(1);

        //清空密码输入框
        pwd.clear();
        //给密码输入框填值
        pwd.sendKeys("lxbbest");
        //线程休息1秒
        sleep(1);

        //清空确认密码输入框
        repwd.clear();
        //给确认密码输入框填值
        repwd.sendKeys("lxbbest");
        //线程休息1秒
        sleep(1);

        //清空手机输入框
        phone.clear();
        //给手机输入框填值
        phone.sendKeys("13856648568");
        //线程休息1秒
        sleep(1);

        //清空年龄输入框
        age.clear();
        //给年龄输入框填值
        age.sendKeys("28");
        //线程休息1秒
        sleep(1);

        //清空校验码输入框
        checkCode.clear();
        //给校验码输入框填值
        checkCode.sendKeys("1234");
        //线程休息1秒
        sleep(1);

        //点击注册按钮进行注册
        submitBtn.click();
        //线程休息1秒
        sleep(1);
        //创建alert弹框对象,并将driver切换到alert窗口中
        Alert alert = driver.switchTo().alert();
        //接受弹框提示
        alert.accept();
        //线程休息5秒
        sleep(5);
    }

    //测试弹框:alert(警示框),confirm(确认框),prompt(对话框)
    //alert.accept(); 确认
    //alert.dismiss(); 取消
    //alert.getText(); 获取弹框提示文本
    //alert.sendKeys("123"); 往对话框中填值

    //窗口切换测试
    @Test
    public void testWindowSwitch() {
        //打开淘宝官网
        driver.get("https://www.taobao.com");
        sleep(2);
        //定位女装链接
        WebElement womenClothes = driver.findElement(By.xpath("(//a[contains(text(),'女装')])[1]"));
        //定位男装链接
        WebElement menClothes = driver.findElement(By.xpath("(//a[contains(text(),'男装')])[1]"));
        //定位家电链接
        WebElement houseElectricals = driver.findElement(By.xpath("(//a[contains(text(),'家电')])[1]"));
        //定位手机链接
        WebElement phones = driver.findElement(By.xpath("(//a[contains(text(),'手机')])[1]"));
        //定位运动链接
        WebElement sports = driver.findElement(By.xpath("(//a[contains(text(),'运动')])[1]"));

        //点击女装链接
        click(womenClothes);
        sleep(2);
        //点击男装链接
        click(menClothes);
        sleep(2);
        //点击家电链接
        click(houseElectricals);
        sleep(2);
        //点击手机链接
        click(phones);
        sleep(2);
        //点击游戏链接
        click(sports);
        sleep(2);

        //获取所有窗口的句柄
        Set<String> handles = driver.getWindowHandles();
        //使用foreach循环遍历Set类型的集合handles集合中的所有句柄
        System.out.println(handles);
        for(String h:handles) {
            //根据句柄切换窗口
            WebDriver window = driver.switchTo().window(h);
            //打印窗口内容
            System.out.println(window.getTitle());
            sleep(2);
            //根据窗口标题来判断当前是哪个窗口，并将driver停在女装这个窗口
            if(window.getTitle().contains("淘宝女装")) {
                break;
            }
        }
        sleep(2);
    }


}
