package com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaLogin extends BaseUI {
    //定位用户名输入框
    @FindBy(xpath = "//input[@id='userName']")
    private WebElement username;

    //定位密码输入框
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    //定位登录按钮
    @FindBy(xpath = "//input[@id='loginBtn']")
    private WebElement loginBtn;

    //登录方法
    public void login(String name, String pwd) {
        //输入登录名
        sendKeys(username,name);
        //线程休息一秒
        sleep(1);
        //输入密码
        sendKeys(password,pwd);
        //线程休息一秒
        sleep(1);
        //点击登录按钮
        click(loginBtn);
    }
}
