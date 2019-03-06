package com.guoyasoft.gyautotest.ui.testCase.test.system.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class SystemLoginPage extends BaseUI {

    //定位用户名输入框
    @FindBy(xpath = "//input[@placeholder='username']")
    private WebElement username;

    //定位密码输入框
    @FindBy(xpath = "//input[@placeholder='password']")
    private WebElement password;

    //定位登录按钮
    @FindBy(xpath = "//span[contains(text(),'登录')]")
    private WebElement loginBtn;

    //登录方法
    public void login(String name, String pwd) {
        username.clear();
        sendKeys(username,name);
        sleep(1);
        password.clear();
        sendKeys(password,pwd);
        sleep(1);
        click(loginBtn);
    }
}
