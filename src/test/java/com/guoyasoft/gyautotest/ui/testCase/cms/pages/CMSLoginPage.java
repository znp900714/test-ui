package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSLoginPage extends BaseUI {

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
        //选中输入框的内容并删除
        sendKeys(username,Keys.CONTROL + "a" + Keys.DELETE );
        //给输入框填值
        sendKeys(username,name);
        //选中输入框的内容并删除
        sendKeys(password,Keys.CONTROL + "a" + Keys.DELETE );
        //给输入框填值
        sendKeys(password,pwd);
        //点击登录按钮
        click(loginBtn);
    }
}
