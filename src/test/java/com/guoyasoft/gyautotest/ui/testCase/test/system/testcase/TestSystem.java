package com.guoyasoft.gyautotest.ui.testCase.test.system.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.system.pages.SystemLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class TestSystem extends BaseUI {

    @Test
    public void testDemo1() {
        //打开后台管理系统的登录页面
        driver.get("http://blog.gdfengshuo.com/example/work/#/login");
        //加载登录页面类
        SystemLoginPage loginPage = PageFactory.initElements(driver,SystemLoginPage.class);
        //调用登录方法
        loginPage.login("znp90","znp90");
        sleep(3);

    }
}
