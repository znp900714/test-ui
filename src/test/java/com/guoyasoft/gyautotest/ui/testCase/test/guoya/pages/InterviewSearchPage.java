package com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class InterviewSearchPage extends BaseUI {

    //学生姓名输入框
    @FindBy(xpath = "//input[@name='custmerName']")
    private WebElement userNameInput;

    //查询按钮
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    //输入学生姓名的方法
    public void userNameInputSendKeys(String userName) {
        sendKeys(userNameInput, userName);
    }

    //点击查询按钮的方法
    public void clickSearchBtn() {
        click(searchBtn);
    }

}
